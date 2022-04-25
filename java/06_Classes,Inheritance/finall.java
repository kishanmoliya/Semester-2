class father{
    final String name = "Father";
    final String k = "kishan";
}
class child extends father{
    String name = "Child";

    void printdetails(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(k);
    }
}
public class finall {
    public static void main(String[] args){
        child ch = new child();
        ch.printdetails(); 
    }
}
