package algorithms;

import java.util.Stack;

public class LeetCode23 {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.length()==0)return true;


        char tmp;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stk.push(s.charAt(i));
            }
            else
            {


                 tmp = stk.pop();

                if(tmp=='(')
                    if(s.charAt(i)!=')')return false;
                if(tmp=='{')
                    if(s.charAt(i)!='}')return false;
                if(tmp=='[')
                    if(s.charAt(i)!=']')return false;

            }

        }
        if(!stk.isEmpty())return false;

        return true;

    }

}
