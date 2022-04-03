import java.util.Scanner;

    public class calculator {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int b;
            System.out.print("Enter the value of x : ");
            int x=input.nextInt();
            System.out.print("Enter the value of y : ");
            int y=input.nextInt();

            System.out.println("sum = addtion of both number \nsub = substrction of both number \nmul = multiplication of both number \ndiv = divition of both number");
            
            System.out.print("enter desition : ");
            String a = input.next();
            System.out.print(a+" = ");
            
            if(a.equals("sum")){
                 b=x+y;
                System.out.println(b);
            }
            else if(a.equals("sub")){
                b=x-y;
                System.out.println(b);
            }
            else if(a.equals("mul")){
                 b=x*y;
                System.out.println(b);
            }
            else if(a.equals("div")){
                b=x/y;
                System.out.println(b);
            }
            else {
                System.out.println("envlid value");
            }
        }
    }