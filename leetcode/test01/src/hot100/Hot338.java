package hot100;

public class Hot338 {
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        for(int i=0;i<=num;i++){
            bits[i] = countOnes(i);
        }
        return bits;

    }
    public int countOnes(int x){
        int ones = 0;
        while(x>0){
            x&=(x-1);
            ones++;

        }
        return ones;
    }

}
