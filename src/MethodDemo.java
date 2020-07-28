/* creating a method to print Hello world does not accept any argument
and will not return any value.
 */

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args){

        System.out.println("Method Demo");
        // creating object to call method as display is in this class
        //but it is non static method so will be called by object
        MethodDemo object = new MethodDemo();
        object.display();
        System.out.println("exitting...");

        Scanner sc = new Scanner(System.in);
        //creating object

        MethodDemo sum = new MethodDemo();
        System.out.println("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int result = sum.add(number1, number2);
        System.out.println(result);
    }
    //declaring and defining out method

    public void display() {
        System.out.println("Hello World");
    }
    public int add(int n1, int n2){
        //a variable to hold return value
        int response = 0;
        //adding two numbers and storing their
        //result into response variable
        response = n1 + n2;
        //returning the value of response
        return response;

    }
}

//create a method add which accept three argument which one argument integer type, second argumnet float type, and third argument double type


