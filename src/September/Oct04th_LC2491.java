package September;

import java.util.Arrays;
/*
https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/
 */
public class Oct04th_LC2491 {
    public static void main(String[] args) {

    }
}

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long chemistry=0;
        int n=skill.length;
        int currentSum=skill[0]+skill[n-1];
        for(int i=0;i<n/2;i++){
            if(currentSum==(skill[i]+skill[n-i-1])){
                chemistry+=(skill[i]*skill[n-i-1]);
            }
            else
                return -1;
        }
        return chemistry;

    }
}
