interface transport{
    void deliver();
}
abstract class animal{
    abstract void forest();
}
class tiger extends animal{
    void forest(){
        System.out.println("This is Tiger");
    }
}
class camel extends animal implements transport{
    void forest(){
        System.out.println("This is Camel");
    }
    public void deliver(){
        System.out.println("This is Camel in interface class");
    }
}
class deer extends animal{
    void forest(){
        System.out.println("This is Deer");
    }
}
class donkey extends animal implements transport{
    void forest(){
        System.out.println("This is Donkey");
    }
    public void deliver(){
        System.out.println("This is Donkey in Interface class");
    }
}

public class transportdemo {
 public static void main(String[] args) {
        animal[] an = new animal[4];
        an[0] = new tiger();
        an[1] = new camel();
        an[2] = new deer();
        an[3] = new donkey();

        an[0].forest();
        an[1].forest();
        an[2].forest();
        an[3].forest();

        camel c = new camel();
        c.deliver();
        donkey d = new donkey();
        d.deliver();
    }   
}
