package hot100;

public class Hot198 {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        if(length==1){
            return nums[0];

        }
        int p = nums[0];
        int q = Math.max(nums[0],nums[1]);

        for(int i=2;i<length;i++){
            int tmp = q;
            q = Math.max(p + nums[i],q);
            p = tmp;
        }
        return q;
    }
}
