// Demonstrate the use of Final Keyword.

class father{
    final String name = "Father";
    //String name = "Royal";          // Throws an Error becouse Name is Final...

    final void demo(){
        System.out.println("Hellow...");
    }
}
class child extends father{
    String name = "Child";             // There were override the variable.. And work.

    /*void demo(){
        System.out.println("Hellow...");        //demo() in child cannot override demo() in father.
    }*/                                         //becouse this is a final Method.

    void printdetails(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class finall {
    public static void main(String[] args){
        child ch = new child();
        ch.printdetails(); 
    }
}
