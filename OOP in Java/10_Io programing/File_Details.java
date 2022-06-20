import java.io.File;
public class File_Details {
    public static void main(String[] args) {
        //String s = String.parseString(args[0]);

        File f1 = new File(args[0]);
        System.out.println(f1.isFile()?"Yes it is File.\nThe File size is = "+f1.length() + "Bytes":"No it is not File!");
        System.out.println(f1.isDirectory()?"hhii"+f1.list():"It is not Directory!");
    }
}
