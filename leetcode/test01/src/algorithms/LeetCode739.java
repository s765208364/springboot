package algorithms;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode739 {
    public int[] dailyTemperatures1(int[] T) {
        int[] result = new int[T.length];
        for(int i=0;i<T.length;i++){
            for(int j=i;j<T.length;j++){
                if(T[i]<T[j])result[i] = T[i] - T[j];
            }
        }
        return result;
    }
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] ans = new int[length];


        Deque<Integer> stack = new LinkedList<Integer>();
        for(int i=0;i<length;i++){
            int temperature = T[i];
            while(!stack.isEmpty()&&temperature>T[stack.peek()]){
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
    }
        return ans;
    }

}
