import java.util.*;
public class HashSett{
   public static void main(String[] args) {
       HashSet<Integer> ha = new HashSet<>(6, 0.5f);
       ha.add(56);
       ha.add(85);
       ha.add(25);
       ha.add(6);
       ha.add(95);
       ha.add(89);

       System.out.println("The size of HashSet = "+ha.size());

       System.out.println("My HashSet = "+ha);
       ha.clear();
       System.out.println("My HashSet After Clear = "+ha);
   } 
}
