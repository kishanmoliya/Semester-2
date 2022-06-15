import java.io.FileInputStream;

public class InputStream{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("test.txt");
            int a = 0;
            a = fis.read();
            while(a != -1){
                System.out.print((char) a);
                a = fis.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}