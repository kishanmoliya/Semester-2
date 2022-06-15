/*     *
      * *
     *   *
    *     *
     *   *
      * *
       *  
*/

import java.util.Scanner;

public class opattern2 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n = ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                  for (int j = i; j < n; j++) {
                        System.out.print(" ");
                  }
                  for (int k = 1; k <= i; k++) {
                        if (k == 1 || k == i) {
                              System.out.print("* ");
                        } else {
                              System.out.print("  ");
                        }
                  }
                  System.out.println();
            }

            for (int i = n - 1; i > 0; i--) {
                  for (int j = i; j <= n - 1; j++) {
                        System.out.print(" ");
                  }
                  for (int k = i; k > 0; k--) {
                        if (k == 1 || k == i) {
                              System.out.print("* ");
                        } else {
                              System.out.print("  ");
                        }
                  }
                  System.out.println();
            }
      }
}
