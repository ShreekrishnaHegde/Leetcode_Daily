package September;

import java.util.Arrays;

/*
https://leetcode.com/problems/sum-of-prefix-scores-of-strings/description/?envType=daily-question&envId=2024-09-25


 */
public class Sept25th_LC2416 {
    public static void main(String[] args) {
        String[] words={"abc","ab","bc","b"};
        System.out.println(Arrays.toString(ans(words)));
    }


    static int[] ans(String[] words){

        Trie myTrie=new Trie();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            myTrie.insert(word); // Insert each word from the array into the Trie
        }
        int[] ans=new int[words.length];//Array to store the answer
        for (int i = 0; i < words.length; i++) {
            ans[i] = myTrie.search(words[i]); // Compute the sum of prefix scores for each word in the array
        }
        return ans;
    }
}

class Trie{
    private int count;//Counts the number of time a node is visited.
    private Trie[] children=new Trie[26];//Each node has children nodes of Trie type.
    public void insert(String word){
        /*
        insert method is called by the tire object,Hence below line created a new varible
        called node which points to the current object i.t myTrie.Now this object acts as the base node/root node.
         */
        Trie node=this;
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int index = c - 'a'; // Obtain the index by subtracting the ASCII value of 'a' from the character
            if (node.children[index] == null) {
                node.children[index] = new Trie(); // Create a new Trie node if it does not exist
            }
            node = node.children[index];
            node.count++; // Increment the count for each node visited
        }
    }

    public int search(String word){
        Trie node=this;
        int sum=0;
//        char[] charArray = word.toCharArray();
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            int index = c - 'a'; // Obtain the index as done in insert function
            if (node.children[index] == null) {
                return sum; // Return the current sum if the node is null (prefix does not exist)
            }
            node = node.children[index];
            sum += node.count; // Add the count of the visited node to the sum
        }
        return sum;
    }
}
/*
->Count is an instance variable of type int.
->And we have object array of type Trie(represents Trie DS0 named children. This array has 26 objects
    and each object in this array can store a reference to another Trie object(node).But when myTrie object
     is created all of its fields are initialized to null.
--Insert Function----
->Insert object is called through the myTrie object ,hence "Trie node = this;" makes the "node" variable
    to point the "myTrie" object. Here, at the beginning we are setting the root node as "myTire".
->We can find the index of each character by subtracting it from 'a'.Now, if children array at index idx is null
    we have to add a new Trie object into that node.Hence, the index of the children array will represent
    the character.Then , we update our root node from "myTrie" to the current node "node".
->Then to count the number of times we visited the node, we increment the count by 1.
->If the idx of children array is not null, then we make the root node as current node, and increment
    the count by 1.
 */