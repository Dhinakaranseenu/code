import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CollectionsSwap{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,18,4,4,8,9,4,8,23);  
          System.out.println("List before swapping: "+list);  
          Collections.swap(list, 2, 9);  
          System.out.println("List after swapping: "+list); 
    }
}