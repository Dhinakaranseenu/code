import java.util.ArrayList;
import java.util.List;

class square{
    public static void main(String[] args) {
        
        List<Double> array = new ArrayList<Double>();

  
  for (int i = 0; i < 10; ++i) {
    array.add(i, Math.pow(i, 2));
  }

  
  for (int i = 0; i < array.size(); ++i) {
    System.out.println(String.format("%2d\t%3.0f", i, array.get(i)));
    }
}
}