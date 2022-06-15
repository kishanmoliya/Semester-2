import java.util.Scanner;
public class opattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc .nextInt();

        if(n%2!=0){
            n = n;
        }
        else{
            n = n-1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==(n/2) || i==(n/2)+1 || i==(n/2)+2 || j>n/2 ){
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

