package company;

import java.util.Arrays;
import java.util.Scanner;

public class MeiTuan1 {
    public static void main(String[] args){
        Scanner myVar = new Scanner(System.in);


        int n = myVar.nextInt();
        int x = myVar.nextInt();
        int y = myVar.nextInt();

        int[] grade = new int[n];
        for(int i=0;i<n;i++){
            grade[i] = myVar.nextInt();
        }
        Arrays.sort(grade);
        for(int i=y;i>=x;i--){
            if(n-y>=x){//淘汰人数
                System.out.println(grade[i]);
                return;
            }
        }

        System.out.println(-1);
    }

}
