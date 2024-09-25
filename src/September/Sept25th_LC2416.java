package September;
/*
https://leetcode.com/problems/sum-of-prefix-scores-of-strings/description/?envType=daily-question&envId=2024-09-25


 */
public class Sept25th_LC2416 {
    public static void main(String[] args) {

    }


    static int[] ans(String[] words){
        int[] ans=new int[words.length];//Array to store the answer
        Trie myTrie=new Trie();
        for (int i = 0; i < words.length-1; i++) { //passing each word to the insert method
            myTrie.insert(words[i]);                  //to insert it into trie.
        }
        return ans;
    }
}

class Trie{
    private int cont;//Counts the number of time a node is visited.
    private Trie[] children=new Trie[26];//Each node has children nodes of Trie type.
    public void insert(String word){
        /*
        insert method is called by the tire object,Hence below line created a new varible
        called node which points to the current object i.t myTrie.Now this object acts as the base node/root node.
         */
        Trie node=this;
        for (int i=0;i<word.length()-1;i++){
            //Obtaining index of the character
            int idx=word.charAt(i)-'a';
            if(node.children[idx]==null)
                node.children[idx]=new Trie();
            node=node.children[idx];
            node.cont++;
        }
    }
}
