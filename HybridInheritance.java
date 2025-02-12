import java.io.*;

class Student2{
    String name = "Aditya Rahangdale";
    int usnNo = 01;
    void displayStudents(){
        System.out.println("Name:\t"+name);
        System.out.println("USN No:\t"+usnNo);
    }
}
interface marks{
    int sub1 = 99;
    int sub2 = 98;
    int sub3 = 97;
    int sub4 = 99;
    int sub5 = 99;

    void displayMarks();
}

interface incentives{
    int incent = 98;

    public void displayIncentives();
}
class Result1 extends Student2 implements marks,incentives{
    int total ;
    float per;
    public void displayMarks(){
        System.out.println("Subject-1:\t"+sub1);
        System.out.println("Subject-2:\t"+sub2);
        System.out.println("Subject-3:\t"+sub3);
        System.out.println("Subject-4:\t"+sub4);
        System.out.println("Subject-5:\t"+sub5);


    }
    public void displayIncentives(){
        System.out.println("Incentives:\t"+incent);
    }
    void calculateResult(){
        total = sub1+sub2+sub3+sub4+sub5+incent;
        per=(total/6.0f);
    }
    void DisplayResult(){
        System.out.println("Total Marks:\t"+total);
        System.out.println("Percentage:\t"+per);
    }

}

public class HybridInheritance {
    public static void main(String args[]) {
        Result1 S1 = new Result1();
        S1.displayStudents();
        S1.displayMarks();
        S1.displayIncentives();
        S1.calculateResult();
        S1.DisplayResult();


    }
}
