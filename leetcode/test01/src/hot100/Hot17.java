package hot100;

import java.io.LineNumberReader;
import java.util.*;

public class Hot17 {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits.length()==0)return combinations;

        Map<Character,String> phoneMap = new HashMap<>();

        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;
    }

    public void backtrack(List<String> combinations,Map<Character,String>phoneMap,String digits,int index,StringBuffer combination){
        if(index==digits.length())combinations.add(combination.toString());
        else{
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            for(int i=0;i<letters.length();i++){
                combination.append(letters.charAt(i));
                backtrack(combinations,phoneMap,digits, index+1,combination);
                combination.deleteCharAt(index);

            }

        }


    }
}
