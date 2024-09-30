package September;

/*
https://leetcode.com/problems/design-a-stack-with-increment-operation/description/
 */
public class Sept30th_LC1381 {
    public static void main(String[] args) {

    }
}
class CustomStack {
    /*
    ->We can stimulate the stack as the array with limited access.
    ->We need an array to store the stack elements and an integer to store the top index.
     */
    private int[] stackArray;
    private int topIndex;
    public CustomStack(int maxSize) {
        stackArray=new int[maxSize];
        topIndex=-1;
    }
    /*
    ->The push operation adds an element to the top of the stack, which corresponds to the end of our array.
    ->We increment topIndex to the next available position in the array and insert the new element there.
     */
    public void push(int x) {
        if(topIndex<stackArray.length-1){
            topIndex++;
            stackArray[topIndex]=x;
        }
    }
    /*
    ->The pop operation removes and returns the element currently at the top of the stack.
    ->We return the element that topIndex points to and then decrement topIndex to indicate the new top element.
    ->I topIndex is less than zero , we return -1;
     */
    public int pop() {
        if(topIndex>=0){
            topIndex=topIndex-1;
            return stackArray[topIndex+1];
        }
        return -1;
    }
    /*
    ->Math.min(k, topIndex+1) determines the maximum number of elements to be incremented.
    ->If k is less than or equal to the current size of the stack (topIndex+1), then k is used as the limit.
    ->Otherwise, the entire stack is incremented by value equal to k.
     */
    public void increment(int k, int val) {
        int limit=Math.min(k,topIndex+1);
        for(int i=0;i<limit;i++){
            stackArray[i]+=val;
        }
    }
}