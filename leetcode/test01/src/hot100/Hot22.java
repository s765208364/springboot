package hot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Hot22 {
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        if(n==0)return combinations;

        backtrack(combinations,0,0,n,new StringBuffer());
        return combinations;


    }
    //括号左边》=右边
    public void backtrack(List<String> combinations,int left, int right,int length,StringBuffer combination){
        if(left==length&&right==length){
            combinations.add(combination.toString());
        }else if(left>=right&&left<=length&&right<=length){
            combination.append('(');
            backtrack(combinations,left+1,right,length,combination);
            combination.deleteCharAt(left+right);

            combination.append(')');
            backtrack(combinations,left,right+1,length,combination);
            combination.deleteCharAt(left+right);

        }else{
            return;
        }

    }

}
