package hot100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hot15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0;k < nums.length -2; k++){
            if(nums[k] > 0)break;
            if(nums[k] == nums[k-1])continue;
            int i = k + 1,j = nums.length - 1;
            while(i<j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    i++;
                    while(i < j && nums[i] == nums[i-1]) i++;
                } else if(sum > 0){
                    j--;
                    while(i < j && nums[j] == nums[j + 1])j--;
                }else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    i++;j--;
                    while(i < j && nums[i] == nums[i - 1])i++;
                    while(i < j && nums[j] == nums[j + 1])j--;
                }
            }
        }
        return res;
    }
}
