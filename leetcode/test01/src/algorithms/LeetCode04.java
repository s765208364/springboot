package algorithms;

import java.util.Collections;
import java.util.LinkedList;

public class LeetCode04 {
    public int[] getLeastNumbers(int[] arr, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }

        Collections.sort(list);

        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {
            result[i] = list.pollFirst();

        }
        return result;
    }

}
