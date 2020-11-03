package algorithms;

import java.util.ArrayList;
import java.util.Stack;

public class LeetCode27 {

    public static void main(String[] args) {

        String[] s = {"../","./","./"};

        System.out.println(minOperations(s));


    }

    public static int minOperations(String[] logs) {

            Stack<String> stk = new Stack<String>();

            System.out.println(stk.size());

            for(int i=0;i< logs.length;i++)
            {
                if("../".equals(logs[i])&&!stk.isEmpty())
                    stk.pop();
                else if("./".equals(logs[i]))
                    continue;
                else
                    stk.push(logs[i]);

                System.out.println(stk.pop());
            }

            return stk.size();


    }

}
