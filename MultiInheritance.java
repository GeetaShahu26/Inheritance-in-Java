import java.util.Scanner;
//java.lang.String;

class Student{
    String name,USN;

    void read1(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Name:");
        name = obj.nextLine();

        System.out.println("Enter the USN:");
        USN = obj.nextLine();
    }
    void display1(){
        System.out.println("Name:\t"+name);
        System.out.println("USN:\t"+USN);
    }
}

class Marks extends Student{
    String sub1,sub2,sub3,sub4,sub5;

    void read2(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the marks of Subject-1:");
        sub1 = obj.nextLine();

        System.out.println("Enter the marks of Subject-2:");
        sub2 = obj.nextLine();

        System.out.println("Enter the marks of Subject-3:");
        sub3 = obj.nextLine();

        System.out.println("Enter the marks of Subject-4:");
        sub4 = obj.nextLine();

        System.out.println("Enter the marks of Subject-5:");
        sub5 = obj.nextLine();
    }
    void display2(){
        System.out.println("Marks of subject-1:\t"+sub1);
        System.out.println("Marks of subject-2:\t"+sub2);
        System.out.println("Marks of subject-3:\t"+sub3);
        System.out.println("Marks of subject-4:\t"+sub4);
        System.out.println("Marks of subject-5:\t"+sub5);

        String total = sub1 + sub2 + sub3 + sub4 + sub5;
    }
}

class Result extends Marks{
     float per;

    void cal(float total,float value) {
        per = value;
        float per = (float) ((total) / (5.0f));
    }
    void display3(){
        System.out.println("Percentage obtained by the student:\t"+per);
    }
}
public class MultiInheritance {
    public static void main(String args[]){
        Result E1 = new Result();
        E1.read1();
        E1.read2();
        E1.display1();
        E1.display2();
        E1.display3();
    }
}
