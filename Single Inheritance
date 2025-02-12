import java.util.Scanner;

class Empolyee{
    String name ;
    int salary;

    void getinfo(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the Empolyee");
        name = obj.nextLine();

        System.out.println("Enter the Salary of the Empolyee");
        salary = obj.nextInt();
    }

    void display(){
        System.out.println("Name of Empolyee:\t" + name);
        System.out.println("salary of the Empolyee:\t" + salary);
    }
}

class Bonous extends Empolyee{
    int bonous;

    void getbonous(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the bonous of the empolyee");
        bonous = obj.nextInt();
    }
    void display2(){
        System.out.println("Bonous:\t"+bonous);
    }
}

public class Main {
    public static void main(String[] args) {
            Bonous E1 = new Bonous();
            E1.getinfo();
            E1.getbonous();
            E1.display();
            E1.display2();
        }
    }
