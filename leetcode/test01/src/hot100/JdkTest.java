package hot100;

import java.time.Period;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

public class JdkTest {

    public static void main(String[] args) {
        //容器
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Object o;
        Vector vector;
        Map<Integer,Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Map<Integer,Integer> hashTable = new Hashtable<>();
        Map<Integer,Integer> curHashMap = new ConcurrentHashMap<>();

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList;

        TreeMap<Integer,Integer> treeMap;
        TreeSet<Integer> treeSet;
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();

        Arrays.sort(new int[0]);
     //   hashtable.put(null,1);
        hashtable.put(1,null);

        //String
        String s_string= new String("123");
        StringBuffer s_stringbuffer;
        StringBuilder s_stringbuilder;

        ThreadPoolExecutor threadPoolExecutor;

    }


}

