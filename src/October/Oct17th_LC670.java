package October;

public class Oct17th_LC670 {
    public static void main(String[] args) {
        maximumSwap(2736);
    }
    public static int maximumSwap(int num) {
        String str=Integer.toString(num);
        StringBuilder string = new StringBuilder(str);
        char max='0';
        int maxPos=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>max){
                max=str.charAt(i);
                maxPos=i;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<max){
                string.setCharAt(i,max);
                string.setCharAt(maxPos,str.charAt(i));
                break;
            }
        }
        return Integer.parseInt(str);
    }
}
