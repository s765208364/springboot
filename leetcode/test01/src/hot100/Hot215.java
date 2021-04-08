package hot100;

import java.util.Arrays;
import java.util.Collections;

public class Hot215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int num = nums.length;
        return nums[num-k];





    }


}
