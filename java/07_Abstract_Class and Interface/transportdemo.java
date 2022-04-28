interface Transport{
    void deliver();
}
abstract class Animal {
    abstract void display();
}
class Tiger extends Animal{
    void display(){
        System.out.println("Display Method calling of Tiger class.");
    }
}
class Camel extends Animal implements Transport{
	Camel(){
		deliver();
	}
    public void deliver(){
        System.out.println("Method calling of Transport Interface through Camel class.");
    }
    void display(){
        System.out.println("Display Method calling of Camel class.");
    }
}
class Deer extends Animal{
    void display(){
        System.out.println("Display Method calling of Deer class.");
    }
}
class Donkey extends Animal implements Transport{
	Donkey(){
		deliver();
	}
    public void deliver(){
        System.out.println("Method calling of Transport Interface through Donkey class.");
    }
    void display(){
        System.out.println("Display Method calling of Donkey class.");
    }
}
public class transportdemo{
    public static void main(String[] args){
        Animal [] animal = new Animal[4];
        animal[0] = new Tiger();
        animal[1] = new Camel();
        animal[2] = new Deer();
        animal[3] = new Donkey();

        System.out.println("-------------------------------- Display Method Calling -----------------------------------");

        animal[0].display();
        animal[1].display();
        animal[2].display();
        animal[3].display();

        // System.out.println("-------------------------------- Deliver Method Calling -----------------------------------");

        // Camel a1 = new Camel();
        // a1.deliver();
        // Donkey a2 = new Donkey();
        // a2.deliver();
    }
}

