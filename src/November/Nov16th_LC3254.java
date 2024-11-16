package November;

import java.util.ArrayList;

public class Nov16th_LC3254 {
    public int[] resultsArray(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int right=k-1;
        while(right<=nums.length-1){
            int flag=0;
            for(int i=left;i<right;i++){
                if(nums[i+1]!=(nums[i]+1)){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                list.add(nums[right]);
            else
                list.add(-1);
            left++;
            right++;
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++)
            ans[i]=list.get(i);

        return ans;
    }
}
