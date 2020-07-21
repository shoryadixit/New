import java.util.Scanner;

class Box{
    double height, width, depth;
}

public class BoxDemo {
    public static void main(String[] args){
        Box mybox = new Box();
        double vol;
        Scanner sc = new Scanner(System.in);

        //Assign values to mybox's instance variables

        System.out.println("Enter width of Box ");
        sc.nextDouble();

        System.out.println("Enter height of Box ");
        sc.nextDouble();

        System.out.println("Enter depth of Box ");
        sc.nextDouble();

        //compute volume of the Box

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}
