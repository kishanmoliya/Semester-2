import java.io.*;

public class replace{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("convert.txt");
            FileOutputStream fos = new FileOutputStream("convert2.txt");
            int a = 0;
            a = fis.read();
            while(a != -1){
                fis = fis.replace("kishan","rohan");
                fos.write(a);
                a = fis.read();
            }
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
