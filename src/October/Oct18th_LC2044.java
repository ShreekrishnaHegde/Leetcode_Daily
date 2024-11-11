package October;

public class Oct18th_LC2044 {
    public static void main(String[] args) {
        int[] nums= new int[]{3,2,1,5};
        System.out.println(countMaxOrSubsets(nums));
    }
    static int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max|=nums[i];
        }
        return countSet(nums,0,0,max);
    }
    static int countSet(int[] nums,int index,int currentOr,int targetOr){
        if(index==nums.length)
            return (currentOr==targetOr)?1:0;
        int countWithout=countSet(nums,index+1,currentOr,targetOr);
        int countWith=countSet(nums,index+1,currentOr|nums[index],targetOr);
        return countWithout+countWith;
    }
}
