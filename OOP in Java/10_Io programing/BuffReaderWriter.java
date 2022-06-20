import java.io.*;
public class BuffReaderWriter{
    public static void main(String[] args){
       try{
        BufferedReader br = new BufferedReader(new FileReader("stu_details.txt"));
        String a;
        a = br.readLine();
        while(a != null){
            System.out.println(a);
            a = br.readLine();
        }

       } catch (Exception e){
        e.printStackTrace();
       }
    }
}