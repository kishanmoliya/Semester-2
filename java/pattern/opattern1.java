/*
        *
       * *
      *   *
     *     *
    * * * * *
*/

import java.util.Scanner;
public class opattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
               if(k==1 || k==i || i==n){
                    System.out.print("* ");
               }
               else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}


/*
        *
       * *
      *   *
     *     *
    *********
*/

import java.util.Scanner;
public class opattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
               if(k==1 || k==i-1){
                    System.out.print("* ");
               }
               else{
                   System.out.print("  ");
               }
            }
            System.out.println();
            if(i==n){
                for(int l=1;l<2*n;l++){
                    System.out.print("*");
                } 
            }
        }
    }
}

