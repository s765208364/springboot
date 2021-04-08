package algorithms;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int[] result = new int[100];
        int num=0;

        while(x!=0){
            result[num] = x%10;
            x/=10;
            num++;
        }

        for(int i=0;i<num/2;i++){
            if(result[i]!=result[num-i])return false;
        }
        return true;
    }
}
