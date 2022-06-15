abstract class school{
    public school(){
        System.out.println("Please pay Fees");
    }
    public void feedetails(){
        System.out.println("You all students just pay Fees");
    }
    abstract public void saysome();
    abstract public void sayAnyThing();
}

class bharad extends school{
    public void saysome(){
        System.out.println("About Bharad...");
    }
    public void sayAnyThing(){
        System.out.println("Youre Fees is panding...");
    }
}

abstract class motherland extends school{
    public void fine(){
        System.out.println("Hello sir...");
    }
}

public class abstractt{
    public static void main(String[] args) {
        //school sc = new school();         -->It stil throw Error.
        bharad bh = new bharad();
        //motherland mo = new motherland();  -->It stil throw Error.

        school sc = new bharad();
        sc.saysome();
        sc.sayAnyThing();
        sc.feedetails();
        
        //school s = new motherland();   -->Not Right.
    }   
}
