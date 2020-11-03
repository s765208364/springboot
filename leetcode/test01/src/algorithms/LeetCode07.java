package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode07 {
    public char firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        char result = ' ', tmp;
        if (s.length() == 0) return ' ';
        for (int i = s.length() - 1; i > 0; i--) {
            if (!set.contains(s.charAt(i))) {
                result = s.charAt(i);
                set.add(s.charAt(i));
            } else {
                if (result == s.charAt(i)) result = ' ';

            }
        }

        return result;
    }
}
