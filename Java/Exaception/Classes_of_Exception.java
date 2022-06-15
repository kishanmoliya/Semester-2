import java.util.Scanner;

class myException extends Exception{
    public String toString(){
        return "I am a toString";
    }
    public String getMessage(){
        return "I am a getMessage";
    }
}
class maxException extends Exception{
    public String toString(){
        return "Age can not be greater then 125";
    }
    public String getMessage(){
        return "Make sure that you entered value of the age is correct";
    }
}

public class Classes_of_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter youre Age = ");
        int a = sc.nextInt();

        if(a<0 || a>125){
            try{
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("The End");
            }
            System.out.println("Comming Soon Second Part...");
        }
        System.out.println("Youre Age is valide");
    }
}
