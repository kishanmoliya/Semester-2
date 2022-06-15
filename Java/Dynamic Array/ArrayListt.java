import java.util.*;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>(5);

        r2.add(17);
        r2.add(27);
        r2.add(37);
        r1.add(2);
        r1.add(9);
        r1.add(7);
        r1.add(3);
        r1.add(0,7);
        r1.add(0,1);
        r1.addAll(0,r2);

        //l1.cleare();

        r1.set(1,999);

        System.out.println(r1.contains(7));
        System.out.println(r1.indexOf(7));
        System.out.println(r1.lastIndexOf(7));

        for(int i=0;i<r1.size();i++){
            System.out.print(r1.get(i));
            System.out.print(", ");
        }
    }
}
