//  Write a java program to do sum of command line argument passed as two Double numbers.
public class commandsum {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDoubble(args[1]);
        double Sum = a+b;
        System.out.println("Sum of two numbers is = "+Sum);
    }
}
