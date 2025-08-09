package August25;

public class Aug09LC231 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo1(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
    public boolean isPowerOfTwo02(int n) {
        return n>0 && (n&(n-1)) == 0;
    }
    public boolean isPowerOfTwo03(int n) {
        if(n==0)return false;
        int x=(int)(Math.log(n)/Math.log(2));
        return Math.pow(2,x)==n;
    }
}
