abstract class vegetable{
    String color;
    abstract public String toString();
}
class potato extends vegetable{
    public String toString(){
        color = "Potato's color is Yellow";
        return color;
    }
}
class bringle extends vegetable{
    public String toString(){
        color = "Bringle's color is Purpal";
        return color;
    }
}
class tomato extends vegetable{
    public String toString(){
        color = "Tomato's color is Red";
        return color;
    }
}

class vagetabledemo{
    public static void main(String[] args) {
        potato p = new potato();
        bringle b = new bringle();
        tomato t = new tomato();

        System.out.println(p.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());
    }
}