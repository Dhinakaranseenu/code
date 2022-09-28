import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListOrder {
    public static void main(String[] args) {
     
        // For ArrayList
        List<String> list = new ArrayList<String>();
  
        
        list.add("Mumbai");
        list.add("CHENNAI");
        list.add("Bangalore");
  
        
        ListIterator<String> g = list.listIterator(list.size());
  
        
        while (g.hasPrevious()) 
        {
        
            System.out.println(g.previous());
        }
  
        
        for (Object i : list)
        {
            
            System.out.println(list.get((Integer) i));
        }
    }
}    

