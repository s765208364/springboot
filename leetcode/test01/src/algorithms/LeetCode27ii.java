package algorithms;

public class LeetCode27ii {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                j++;
            }else {
                if(i==j&&i!=nums.length-1){
                    nums[j] = nums[i+1];
                }
            }
        }
        return j;
    }
}
