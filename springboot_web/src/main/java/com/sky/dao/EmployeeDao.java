package com.sky.dao;

import com.sky.pojo.Department;
import com.sky.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;
    static{
        employees = new HashMap<Integer, Employee>();

        employees.put(101,new Employee(101,"AA","111@126.com",1,new Department(101,"教学部"),null));
        employees.put(102,new Employee(102,"BB","111@126.com",1,new Department(102,"教学部"),null));
        employees.put(103,new Employee(103,"CC","111@126.com",1,new Department(103,"教学部"),null));
        employees.put(104,new Employee(104,"DD","111@126.com",1,new Department(104,"教学部"),null));
        employees.put(105,new Employee(105,"EE","111@126.com",1,new Department(105,"教学部"),null));

    }
    private static Integer initId=1006;

    public void  save(Employee employee) {
        if(employee.getId()==null) {
            employee.setId(initId++);

        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();

    }
    public Employee getEmployeeById(Integer id){
        return employees.get(id);

    }

    public void  delete(Integer id){
        employees.remove(id);

    }

}
