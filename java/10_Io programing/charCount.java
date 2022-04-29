import java.io.*;
public class charCount {

public static void main(String[] args){
        try{
            int Characters = 0;
            int Word = 0;
            int Line = 0;
            FileInputStream fis = new FileInputStream("test.txt");
            int a = 0;
            a = fis.read();
            while(a != -1){
                if(a == 32){
                    Word++;
                    Characters--;   
                }
                else if(a == 10){
                    Line++;
                    Word++;
                    Characters-=2;
                }
                Characters++;
                a = fis.read();
            }
            Word++;
            Line++;
            System.out.println(Characters);
            System.out.println(Word);
            System.out.println(Line);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    } 
}
