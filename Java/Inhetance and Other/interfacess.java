interface mybody{
    int a = 7;                      // It is a by defolt 💪"Final"💪.
    void eating(int stamakFull);
    void punch(int stranth);
}

class hand implements mybody{
    void fingers(){
        System.out.println("My fingers is very strong");
    }

    public void eating(int stamakFull){
        System.out.println("I am eating a Gola");
    }

    public void punch(int stranth){
        System.out.println("I Slaped Uttam"); 
    }
}



public class interfacess{ 
    public static void main(String[] args) {
        //mybody my = new mybody(); --> You can not do.🤷
        hand h = new hand();
        h.fingers();
        h.eating(1);
        h.punch(10);

        //  h.a = 10;     You can not do NOt chang the value of a because interfaces is final.

        System.out.println(h.a);
    }
}
