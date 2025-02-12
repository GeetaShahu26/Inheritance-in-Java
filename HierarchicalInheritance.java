import java.util.Scanner;

class Mahendra {
    void displayinfo() {
        System.out.println("Welcome to Mehendra group of Industries");
    }
}

    class KUV extends Mahendra {
        String model = "KUV";
        String price = "6laks";

        void display()
        {

                System.out.println("Model name:\t" + model);
                System.out.println("Price:\t" + price);

        }
    }
    class TUV extends Mahendra {
        String model = "TUV";
        String price = "10laks";

        void display()
        {

                System.out.println("Model name:\t" + model);
                System.out.println("Price:\t" + price);

        }
    }

    class XUV extends Mahendra {
        String model = "XUV";
        String price = "12laks";

        void display()
        {

                System.out.println("Model name:\t" + model);
                System.out.println("Price:\t" + price);

        }
    }
    public class HierarchicalInheritance{
        public static void main(String args[]){
            KUV K1 = new KUV();
            K1.displayinfo();
            K1.display();

           TUV T1 = new TUV();
            T1.displayinfo();
            T1.display();

            XUV X1 = new XUV();
            X1.displayinfo();
           X1.display();
        }
    }
