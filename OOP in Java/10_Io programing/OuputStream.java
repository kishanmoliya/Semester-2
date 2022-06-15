import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
public class OuputStream {
    public static void main(String[] args) {
     try{
        FileOutputStream fos = new FileOutputStream("test2.txt");
        byte[] out = "Moliya Kishan".getBytes();
        fos.write(out);
        fos.close(); 
     }catch(Exception e){
        e.printStackTrace();
        }
    }
}
