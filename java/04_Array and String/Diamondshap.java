/* Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as 
follows:
  *
 * *
* * *
 * *
  *        */

import java.util.Scanner;
public class Diamondshap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for(int i=1;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i=n;n>0;n--)
        {
            for(int j=n;j<i;j++)
            {   
                System.out.print(" ");
            }
            for(int k=n;k>0;k--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}


//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n  = ");
//         int n = sc.nextInt();

//         for(int i = 1 ; i < n ; i++){
//             for(int j = i ; j<n ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1 ; k <= i ; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         for(int i = n ; i > 0 ; i--){
//             for(int j = i ; j<n ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = i ; k > 0 ; k--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
