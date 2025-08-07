package August25;

import java.util.ArrayList;
import java.util.List;

public class Aug01LC118 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        //Dynamic Programming Approach
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int left=ans.get(i-1).get(j-1);
                    int right=ans.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            ans.add(row);
        }
        return ans;
    }

}
