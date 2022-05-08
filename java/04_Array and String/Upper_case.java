//Write an application that searches through its command-line argument. If an argument is found that does not begin with 
//and upper case letter, display error message and terminate.

import java.util.Scanner;
public class Upper_case{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string : ");
        // String st = sc.next();
        
        //     if(st.charAt(0)>='A' && st.charAt(0)<='Z')           
        //     {
        //         System.out.print("You are going on true");
        //     }
        //     else
        //     {
        //         System.out.println("Which character you entered is not valid \nPlease Enter a valid character");
        //     }

        if(args[0].charAt(0)>='A' && args[0].charAt(0)<='Z')   
        {
            System.out.print("You are going on true");
        }
        else
        {
            System.out.println("Which character you entered is not valid \nPlease Enter a valid character");
        }
    }
}
