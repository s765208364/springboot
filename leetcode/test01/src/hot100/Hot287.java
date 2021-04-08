package hot100;

import java.util.Arrays;

public class Hot287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int target = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(target==nums[i])return target;
            target = nums[i];

        }
        return target;

    }

}
