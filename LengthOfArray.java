import java.util.*;
  
public class LengthOfArray {
    public static void main(String[] args)
        throws Exception
    {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
          
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        
        System.out.println("ArrayList: " + arrlist);
        
        int size = arrlist.size();
   
        System.out.println("Size of ArrayList = " + size);
    }
}