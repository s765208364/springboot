package company;

import java.util.Arrays;
import java.util.Scanner;

public class MeiTuan2 {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);

        int n = myVar.nextInt();

        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = myVar.nextInt();

        }

        Arrays.sort(result);
        int jieguo=0;

        for(int i=0;i<result.length;i++){
            jieguo+=Math.abs(result[i]-i-1);

        }

        System.out.println(jieguo);
    }
}
