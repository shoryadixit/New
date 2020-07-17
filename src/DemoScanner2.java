import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class DemoScanner2 {
    public static void main (String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = SC.next();
        System.out.println("Enter youer Roll no. :");
        int rollnumber = SC.nextInt();
        System.out.println("Enter your percentage ");
        double percentage = SC.nextDouble();
        System.out.println("Enter your Section : ");
        String section = SC.next();
        System.out.println("Enter your course : ");
        String course = SC.next();


        System.out.println(name);

    }
}
