import java.util.Scanner;

import javax.sql.XADataSource;
class multipal_Exaception{
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 45;
        marks[1] = 86;
        marks[2] = 23;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Index of array = ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with = ");
        int num = sc.nextInt();

        try{
            System.out.println("The value at array index entered is = "+marks[ind]);
            System.out.println("Array index / num = "+marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException accured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException accured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception accured!");
            System.out.println(e);
        }
    }
}