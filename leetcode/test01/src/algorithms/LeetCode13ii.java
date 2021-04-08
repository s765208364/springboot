package algorithms;

import java.util.*;

public class LeetCode13ii {
    public int romanToInt(String s) {
        Map<Character,Integer> hashMap= new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);

        //List<Character> list = new ArrayList<>();
        int sum=0;
        int preNum = hashMap.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int num = hashMap.get(s.charAt(i));
            if(preNum<num){
                sum-=preNum;
            }else {
                sum+=preNum;

            }
            preNum = sum;

        }
            sum+=preNum;
            return sum;
    }

}
