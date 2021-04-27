package algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode05 {
    public static String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        boolean[][] dp = new boolean[len][len];
        for(int i=0;i<len;i++){
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        //先计算下标，然后计算字串长度
        for(int l=2;l<=len;l++){

            for(int i=0;i<len;i++){
                int j = i + l -1;
                if(l > len || j >= len){
                    break;
                }
                if(charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                    if(l<=2)
                        dp[i][j] = true;
                    else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j] && l > maxLen){
                    maxLen = l;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("aaaa"));


    }

}
