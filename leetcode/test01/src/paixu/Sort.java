package paixu;

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
    public void buildMaxHeap(int[] A,int len){
        for(int i=len/2;i>0;i--)
            adjustDown(A,i,len);
    }
    public void adjustDown(int[] A,int k,int len){
        A[0] = A[k];
        for(int i=2*k;i<=len;i*=2){
            if(i<len&&A[i]<A[i=1])
                i++;

            if(A[0]>=A[i])break;
            else{
                A[k] = A[i];
                k=i;

            }
        }
    }
    public void heapSort(int[] A,int len){
        buildMaxHeap(A,len);
        for(int i=len;i>1;i--){




        }


    }



}
