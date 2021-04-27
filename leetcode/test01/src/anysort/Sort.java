package anysort;

public class Sort {

    //插入排序
    public static void insertSort(int[] numbers){
        int size = numbers.length;
        int temp = 0;
        int j = 0;
        for(int i=0;i<size;i++)
        {
            temp = numbers[i];
            for(j = i;j>0&&temp<numbers[j-1];j--)
            {
                numbers[j] = numbers[j-1];
            }
            numbers[j] = temp;
        }
    }
    //希尔排序
    public static void shellSort(int[] data){
        int j = 0;
        int temp = 0;
        for(int increment = data.length/2;increment > 0;increment /= 2){
            for(int i = increment;i < data.length;i++){
                temp = data[i];
                for(j = i;j >= increment;j -=increment ){
                    if(temp>data[j - increment]){
                        data[j] = data[j - increment];
                    }
                    else{
                        break;
                    }

                }
                data[i] = temp;
            }
        }

    }
    //冒泡排序
    public static void bubbleSort(int[] numbers){
        int temp = 0;
        int size = numbers.length;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j] > numbers[j+1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    //快速排序
    public void quickSort(int[] numbers,int low,int high){
        if(low<high){
            int middle = getMiddle(numbers,low,high);
            quickSort(numbers,low,middle - 1);
            quickSort(numbers,middle + 1,high);
        }
    }
    public static int getMiddle(int[] numbers,int low,int high){
        int temp = numbers[low];
        while(low<high){
            while(low<high&&numbers[high]>=temp){
                high--;
            }
        numbers[low] = numbers[high];
        while(low<high&&numbers[high]<=temp){
            low++;
        }
        numbers[high] = numbers[low];
        }
        numbers[low] = temp;
        return low;
    }
    //堆排序
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);
            --heapSize;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; --i) {
            maxHeapify(a, i, heapSize);
        }
    }

    public void maxHeapify(int[] a, int i, int heapSize) {
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a, largest, heapSize);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //kmp算法求next数组
    public void genNext(int next[] , String t){
        int j = 0,k = -1;
        next[0] = -1;
        while(j < t.length() - 1){
            if(k == -1 || t.charAt(j) == t.charAt(k)){
                j++;k++;
                next[j] = k;
            }else{
                k = next[k];
            }
        }
    }
    public int kmp(String a,String b){
        int[] next = new int[100];
        int i=0,j=0;
        genNext(next,b);
        while(i < a.length() && j < b.length()){
            if(j == -1 || a.charAt(i)== b.charAt(j)){
                i++;
                j++;
            }else {
                j = next[j];   //j回退
            }
        }
        if(j >= b.length()){
            return (i -b.length());   //匹配成功
        }else{
            return -1;
        }
    }

}
