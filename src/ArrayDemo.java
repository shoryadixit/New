import java.util.Scanner;

public class ArrayDemo {
    public static void main (String[] args){
       int[] marks = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five elements in array");
        for(int i = 0; i < marks.length ; i++)
            marks[i] = sc.nextInt();
        for (int mark : marks) System.out.print(mark + ",");

        System.out.println();

        System.out.println(marks.length);
    }

}
