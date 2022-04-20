abstract class vagetable{
    abstract String color();
}
class potato extends vagetable{
    public String color(){
        return "chamdi";
    }
}
class bringle extends vagetable{
    public String color(){
        return "green";
    }
}
class tomato extends vagetable{
    public String color(){
        return "red";
    }
}

class p extends potato{
    public String color(){
        return "Potato";
    }
}
class b extends bringle{
    public String color(){
        return "Bringle";
    }
}
class t extends tomato{
    public String color(){
        return "Tomato";
    }
}

class vagetabledemo{
    public static void main(String[] args) {
        potato p = new potato();
        p p1 = new p();
        System.out.println("Color of "+p1.color()+" is "+p.color());

        bringle b = new bringle();
        b b1 = new b();
        System.out.println("Color of "+b1.color()+" is "+b.color());

        tomato t = new tomato();
        t t1 = new t();
        System.out.println("Color of "+t1.color()+" is "+t.color());
    }
}