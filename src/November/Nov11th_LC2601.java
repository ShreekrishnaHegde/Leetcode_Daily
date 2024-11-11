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
    /*
    public boolean primeSubOperation(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        int[] previousPrime=new int[max+1];
        for(int i=2;i<=max;i++){
            if(isPrime(i))
                previousPrime[i]=i;
            else
                previousPrime[i]=previousPrime[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int flag;
            if(i==0)
                flag=nums[i];
            else
                flag=nums[i]-nums[i-1];
            if(flag<=0)
                return false;
            int largestPrime=previousPrime[flag-1];
            nums[i]=nums[i]-largestPrime;
        }
        return true;
    }

    //Function to check whether number is prime or not.
    private boolean isPrime(int x){
        for(int i=2;i<=sqrt(x);i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
     */
}
