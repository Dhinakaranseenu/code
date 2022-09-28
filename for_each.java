import java.util.ArrayList;

class for_each{
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
          
        arrlist.add(45);
        arrlist.add(26);
        arrlist.add(48);
        arrlist.add(86);
        arrlist.add(98);

        for (int num : arrlist) {

            System.out.println(num);
            
        }
    }
}