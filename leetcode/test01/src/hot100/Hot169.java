package hot100;

public class Hot169 {
    public int majorityElement(int[] nums) {
        int flag = nums[0];
        int number = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==flag){
                number++;
            }else if(number==0){
                flag = nums[i];
                number=1;
            }else{
                number--;
            }

        }
        return flag;
    }
}