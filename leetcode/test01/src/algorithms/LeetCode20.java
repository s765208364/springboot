package algorithms;

import com.sun.org.apache.xerces.internal.impl.xs.traversers.XSAttributeChecker;

import java.util.LinkedList;
import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.length() == 0 || s == null)
            return true;

        stack.add(s.charAt(0));

        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else{
                char tmp = stack.pop();
                if(tmp == '(' && s.charAt(i) == ')')continue;
                if(tmp == '[' && s.charAt(i) == ']')continue;
                if(tmp == '{' && s.charAt(i) == '}')continue;
                return false;
            }


        }
        return true;
    }
}
