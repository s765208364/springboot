package hot100;

import java.util.Arrays;
import java.util.Collections;

public class Hot215 {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums,heapSize);
        for(int i=nums.length - 1;i >= nums.length - k + 1;i--){
            swap(nums,0,i);
            --heapSize;
            maxHeapify(nums,0,heapSize);
        }
        return nums[0];
    }
    public void buildMaxHeap(int[] nums,int heapSize){
        for(int i=heapSize/2;i>=0;i--){
            maxHeapify(nums,i,heapSize);
        }
    }
    public void maxHeapify(int[] nums,int i,int heapSize){
        int l = i *2 +1,r = i*2+2,largest = i;
        if(l<heapSize&&nums[largest] < nums[l]){
            largest = l;
        }
        if(l<heapSize&&nums[largest]<nums[r]){
            largest = r;
        }
        if(largest!=i){
            swap(nums,i,largest);
            maxHeapify(nums,largest,heapSize);
        }
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}