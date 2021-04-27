package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestPrint {
    public  static void main(String[] arg){

        String s = "123";
        int a = Integer.parseInt(s);
        String.valueOf(0);
        System.out.println(a);

    }
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

}
