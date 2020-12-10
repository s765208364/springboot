package hot100;

public class Hot461 {
    public int hammingDistance(int x, int y) {
        int tmp = x^y;
        return Integer.bitCount(tmp);
    }

}
