class member{
    String name;
    int age;
    String phonnumber;
    String address;
    double salary;

    public member(String name ,int age, String phonnumber , String address , double salary){
        this.name = name;
        this.age = age;
        this.phonnumber = phonnumber;
        this.address = address;
        this.salary = salary;
    }

    public  void printsalary(){
        System.out.println("Salary = "+salary);
    }
}
class employee extends member{
    String specialization;

    public employee(String name ,int age, String phonnumber , String address , double salary ,String specialization){
        super(name, age, phonnumber, address, salary);
        this.specialization = specialization;
    }
} 
class manager extends member{
    String department;

    public manager(String name ,int age, String phonnumber , String address , double salary ,String department){
        super(name, age, phonnumber, address, salary);
        this.department = department;
    }
}
public class three{
    public static void main(String[] args) {
        employee e = new employee("abc",19,"4567894567","asdf",1230.25,"kjff");
        manager m = new manager("abbc",18,"4451894567","asdgfrf",12380.25,"dep");

        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.phonnumber);
        System.out.println(e.address);
        System.out.println(e.salary);
        System.out.println(e.specialization);

        System.out.println("");
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.phonnumber);
        System.out.println(m.address);
        System.out.println(m.salary);
        System.out.println(m.department);

    }
}
























// class member{
//     String name;
//     int age;
//     String phonnumber;
//     String address;
//     double salary;

//     public  void printsalary(){
//         System.out.println("Salary = "+salary);
//     }
// }
// class employee extends member{
//     String specialization;
// } 
// class manager extends member{
//     String department;
// }
// public class three{
//     public static void main(String[] args) {
//         employee e = new employee();
//         e.name = "kishan";
//         e.age = 19;
//         e.phonnumber = "123456789";
//         e.address = "rajkot";
//         e.salary = 123.25;
//         e.specialization = "java";

//         manager m = new manager();
//         m.name = "karan";
//         m.age = 18;
//         m.phonnumber = "8596478526";
//         m.address = "rajkot";
//         m.salary = 125.25;
//         m.department = "computer";

//         System.out.println(e.name);
//         System.out.println(e.age);
//         System.out.println(e.phonnumber);
//         System.out.println(e.address);
//         System.out.println(e.salary);
//         System.out.println(e.specialization);

//         System.out.println("");
//         System.out.println(m.name);
//         System.out.println(m.age);
//         System.out.println(m.phonnumber);
//         System.out.println(m.address);
//         System.out.println(m.salary);
//         System.out.println(m.department);
//     }
// }