package October;
/*
https://leetcode.com/problems/separate-black-and-white-balls/description/
 */
public class Oct15th_LC2938 {

    public static void main(String[] args) {

    }
    public long minimumSteps(String s) {
        int whitePos=0;
        long totalSwaps=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                totalSwaps+=i-whitePos;
                whitePos++;
            }
        }
        return totalSwaps;
    }
}

/*
------------Understanding the question-------------
->Binary String is a string which only has two characters, 0 and 1.
->Given a binary String and the task is to find the minimum number of swaps(swapping only adjacent characters)
    required to group all 1's of the binary string to the right and all 0's to the left.
 */
