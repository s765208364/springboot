package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hot4 {
    public double findMedianSortedArrays(int[] nums1, int [] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i< nums1.length;i++)
            list1.add(nums1[i]);

        for(int i=0;i< nums2.length;i++)
            list1.add(nums2[i]);

        Collections.sort(list1);
        int mid = (nums1.length+nums2.length)/2;
        return list1.get(mid);

    }


}
