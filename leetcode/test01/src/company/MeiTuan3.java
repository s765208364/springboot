package company;

import java.util.Scanner;

public class MeiTuan3 {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        int T = myVar.nextInt();

        while((T--)>0){
            int N = myVar.nextInt();
            String s = myVar.nextLine();
            int M = myVar.nextInt();
            String MF = myVar.nextLine();

            int[][] result = new int[N][2];
            for(int i=0;i<N;i++){
                if(s.charAt(i)=='0'){

                }else if(s.charAt(i)=='1'){
                    result[i][0]=1;
                }else if(s.charAt(i)=='2'){
                    result[i][0] = 1;
                    result[i][1] = 1;
                }
            }
            for(int i=0;i<M;i++){
                if(MF.charAt(i)=='M'){
                    for(int j=0;j<N;j++){




                    }

                }else if(MF.charAt(i)=='F'){


                }

            }


        }



    }

}
