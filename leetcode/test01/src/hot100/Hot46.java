package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hot46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<>();
        for(int tmp:nums){
            combine.add(tmp);
        }
        int n = nums.length;
        dfs(combine,ans,0,n);
        return ans;
    }
    public void dfs(List<Integer> combine,List<List<Integer>> ans,int begin,int n){
        if(n==begin)ans.add(new ArrayList<Integer>(combine));

        for(int i=begin;i<n;i++){
            Collections.swap(combine,begin,i);
            dfs(combine,ans,begin+1,n);
            Collections.swap(combine,begin,i);
        }

    }

}
