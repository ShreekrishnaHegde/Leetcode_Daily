package September;

import java.util.Map;
import java.util.TreeMap;

public class Sept26th_LC729 {
    public static void main(String[] args) {

    }
}
class MyCalendar {
    /*
    Below lines creates a new object of TreeMap type,which stores two values ,
    a key and a value. Here both are integers.The values are inserted in
    ascending order of keys.
    --Internal Working--
    It compares the new key with the key of the current node.If the new key is less than
    the current node's key, it moves to the left child. If the new key is greater than
    the current node's key, it moves to the right child.
    */
    TreeMap<Integer,Integer> calender=new TreeMap<>();
    public MyCalendar() {
        calender.put(Integer.MAX_VALUE,Integer.MAX_VALUE);
    }
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> pair = calender.higherEntry(start);
        /*
        pair.getValue will give the start time of next booking, and end represents end pf exisintg
        booking. if  end time of the new booking is less than or equal to the start time of the
        next existing booking, res will be true.
        */
        boolean res=end<=pair.getValue();
        if(res)
            calender.put(end,start);
        return res;
    }
}
