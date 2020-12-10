package hot100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hot448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>  result = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int tmp = Math.abs(nums[i]) - 1;

            if(nums[tmp]>0){
                nums[tmp] *= -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);

            }

        }
        return result;
    }

}
