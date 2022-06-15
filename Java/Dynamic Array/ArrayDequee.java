import java.util.ArrayDeque;

public class ArrayDequee{
    public static void main(String[] args) {
        ArrayDeque<Integer> de = new ArrayDeque<>();
        de.add(7);
        de.add(13);
        de.add(18);
        de.add(3);
        de.addFirst(22);
        System.out.println(de.getFirst());
        System.out.println(de.getLast());

        System.out.println("Array Deque Elements");
        System.out.println(de);
    }
}