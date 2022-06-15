import java.util.Scanner;
public class Nested_Try_Catch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 45;
        marks[1] = 86;
        marks[2] = 23;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter the value of index = ");
            int ind = sc.nextInt();

            try{
                System.out.println("Welcome to Nested Exception demo...");
                try{
                    System.out.println("you enterd index value is = "+marks[ind]);
                    flag = false;
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index is not exist!");
                    System.out.println("It's second Exception Level 2");
                }
            }catch(Exception e){
                System.out.println("It's First Exception Level 1");
            }
            System.out.println("Comming Soon Second Part...");
        }   
    }
}
