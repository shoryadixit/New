/* creating a method to print Hello world does not accept any argument
and will not return any value.
 */

public class MethodDemo {
    public static void main(String[] args){

        System.out.println("Method Demo");
        // creating object to call method as display is in this class
        //but it is non static method so will be called by object
        MethodDemo object = new MethodDemo();
        object.display();
        System.out.println("exitting...");

    }
    //declaring and defining out method

    public void display(){
        System.out.println("Hello World");
    }
}
