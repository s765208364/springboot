package hot100;

import java.util.HashSet;
import java.util.Set;

public class Hot3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int rk = 1,ans =  0;
        set.add(s.charAt(0));
        for(int i=0;i<n;i++){
            if(i!=0)
                set.remove(s.charAt(i));
            while(rk < n && !set.contains(s.charAt(rk))){
                set.add(s.charAt(rk));
                rk++;
            }
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }

}
