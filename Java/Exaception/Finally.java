public class Finally {
    public static int greet(){
        try{
            int a = 100;
            int b = 10;
            int c = a/b;
            return c;
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Method is always Invock In Frist");
        }
        return -1;
    }
   public static void main(String[] args) {
      int k = greet();
      System.out.println(k); 

      int a = 27;
      int b = 7;
        while(true){
            try{
                System.out.println("27/"+b+" = "+a/b);
            }catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("This is Finally Of value b = "+b);
            }
            b--;
        }
        try{
            System.out.println("50/3 = "+50/3);
        }
        finally{
            System.out.println("With out catch Finally Method");
        }
   } 
}
