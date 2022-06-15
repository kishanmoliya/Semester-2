import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileConvert{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("convert.txt");
            FileOutputStream fos = new FileOutputStream("convert2.txt");
            int a = 0;
            a = fis.read();
            while(a != -1){
                fos.write(a);
                a = fis.read();
            }
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
