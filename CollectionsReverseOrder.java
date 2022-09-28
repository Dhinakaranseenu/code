import java.util.Collections;
import java.util.LinkedList;

class  CollectionsReverseOrder{
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();

        li.add(88);
        li.add(96);
        li.add(-45);
        li.add(91);
        li.add(-100);
        li.add(-20);

        Collections.sort(li,Collections.reverseOrder());
        System.out.println("list sorted in revers order");
        System.out.println(li);
    }
}