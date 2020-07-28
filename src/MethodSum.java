import java.util.Scanner;

public class MethodSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();

        MethodSum Add = new MethodSum();

        double v;
        System.out.println(Add.add(a, b, c));


    }
    public double add (int no1, float no2, double no3){
        double response;
        response = no1 + no2 + no3;
        return response;
    }
}
