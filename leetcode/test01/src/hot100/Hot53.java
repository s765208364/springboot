package hot100;

public class Hot53 {
    public int maxSubArray(int[] nums) {
        int pre = 0,maxAns = nums[0];
        for(int x:nums){
            pre = Math.max(pre + x,x);
            maxAns = Math.max(maxAns,pre);

        }
        return maxAns;

    }
}
