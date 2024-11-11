package November;

import static java.lang.Math.sqrt;

public class Nov11th_LC2601 {
    public static void main(String[] args) {

    }
    private boolean isPrime(int number){
        for(int i=2;i<=sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public boolean primeSubOperation(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int flag;
            if(i==0)
                flag=nums[0];
            else
                flag=nums[i]-nums[i-1];
            if(flag<=0)
                return false;
            int largestPrime=0;
            for(int j=flag-1;j>=2;j--){
                if(isPrime(j)){
                    largestPrime=j;
                    break;
                }
            }

            nums[i]=nums[i]-largestPrime;
        }
        return true;
    }
}
