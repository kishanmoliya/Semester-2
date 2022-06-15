class father{
    father(){
        System.out.println("Constractore Father");
    }

    String name = "Variable Father";

    public void name(){
        System.out.println("Method Father");
    }
}
class child extends father{
    child(){
        System.out.println("Constractore child");
    }

    String name = "Variable Child";

    public void name(){
        super.name();
        System.out.println("Method Child");
    }

    void printdetails(){
        System.out.println();
        System.out.println(super.name);
        System.out.println(name);

        System.out.println();
        name();         // We not need to write because in Method we write super.name();
    }
}

public class superr {
    public static void main(String[] args) {
        
        child ch = new child();
        ch.printdetails();
    }
}
