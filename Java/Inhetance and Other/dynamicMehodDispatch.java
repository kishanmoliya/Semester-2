// It is run time polimorphisum..

class phone{
    public void showtime(){
        System.out.println("Now time is Good night...");
    }
    public void call(){
        System.out.println("Calling Friends with Simplephone...");
    }
}
class smartPhone extends phone{
    public void bgmi(){
        System.out.println("playing Bgmi...");
    }
    public void call(){
        System.out.println("Calling Friends with Smartphone...");
    }
}

public class dynamicMehodDispatch {
    public static void main(String[] args) {
        phone p = new smartPhone();
        p.call();
        p.showtime();
       // p.bgmi();       It's stil not wark;

      // smartphone p = new phone();    It's stil also not wark;
    }
}

//     --> Out put <--
//     calling Friends with Smartphone...
//     Now time is Good night...



// class umeshbhai{
//     public int defolt(){
//         return 7;
//     }
//     public void vivek(){
//         System.out.println("son of umeshbhai...");
//     }
// }

// class sureshbhai extends umeshbhai{
//     public void vivek(){
//         System.out.println("son of sureshbhai...");
//     }
//     public void jay(){
//         System.out.println("2ed son of sureshbhai...");
//     }
// }

// public class dynamicMehodDispatch{
//     public static void main(String[] args) {
//         umeshbhai u = new sureshbhai();
//         u.vivek();
//         u.defolt();
//     }
// }
