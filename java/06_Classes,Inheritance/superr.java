// class father{
//     public void name(){
//         System.out.println("This is a Father");
//     }
// }
// class child extends father{
//     public void name(){
//         super.name();
//         System.out.println("This is a Child");
//     }
// }

// Second Exampal...
class father{
    String name = "Father";
}
class child extends father{
    String name = "Child";

    void printdetails(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class superr {
    public static void main(String[] args) {
        
        child ch = new child();
        ch.printdetails();
    }
}
