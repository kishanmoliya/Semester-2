import java.util.Scanner;
public class Stream{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String a = sc.nextLine();

        for(int i=0;i<a.length();i++)
        {
            for(int j=i;j<a.length();j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(a.charAt(k)+" ");
            }
            System.out.println();
        }
    }
}
