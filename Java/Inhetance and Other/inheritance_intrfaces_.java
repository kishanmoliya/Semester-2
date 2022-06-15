interface hand{
    void eat();
    void puss();

    // private void pull(){ 
    //     System.out.println("Pull any thing...");  //-->We can not able to calling.
    // }                                             //--> It mean not call this function.

    // default void slap(){
    //     pull();         //-->It's run private method pull    //-->If we override this method then it is not work.
    //     System.out.println("Where It's use You know..");     //-->If we not override then this method is run.
    // }                                                        //-->But only "defolt" method.    
}

interface leges{
    String[] walk();
    void run(String runtype);
}
class mind{ 
    void massage(int finger){
        System.out.println("Moves finger" + finger);
    }
    void blood(){
        System.out.println("blood is moving our body...");
    }
}

class allbody extends mind implements leges,hand{
    public void eat(){
        System.out.println("Eating food...");
    }
    public void puss(){
        System.out.println("Puss the Door...");
    }
    // public void slap(){
    //     System.out.println("Slap meance...");
    // }

    public String[] walk(){
        System.out.println("Types of walk.");
        String[] walktype = {"Slow walk","Normal Walk","Fast walk"};
        return walktype;
    }
    public void run(String runtype){
        System.out.println("Run like "+runtype);
    }
}


public class inheritance_intrfaces_{
    public static void main(String[] args) {
        allbody al = new allbody();
        al.eat();
        al.puss();
        al.blood();

       // al.pull();  -->This method is private. we can not able to call.

       String[] mk = al.walk();
       for(String type:mk){
           System.out.println(type);
       }

        // hand ha = new allbody();
        // ha.slap();
    }
}  
