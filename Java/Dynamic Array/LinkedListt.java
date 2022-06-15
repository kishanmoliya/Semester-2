import java.util.*;
public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(17);
        l2.add(27);
        l2.add(37);

        l1.add(2);
        l1.add(9);
        l1.add(7);
        l1.add(3);

        l1.add(0,7);
        l1.add(0,1);

        l1.addAll(0,l2);

        l1.addLast(777);
        l1.addFirst(888);

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
