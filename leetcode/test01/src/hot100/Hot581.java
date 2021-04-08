package hot100;

import java.util.Arrays;

public class Hot581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i] = nums[i];
        }
        Arrays.sort(result);
        int i=0,j=nums.length - 1;
        while (i<j){
            if(nums[i]!=result[i])i++;
            if(nums[j]!=result[j])j--;
        }
        return j-i+1;
    }


}
