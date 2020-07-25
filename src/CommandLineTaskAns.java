public class CommandLineTaskAns {
    public static void main(String [] args){
       try {
           for (int i = 0; i < 1; i++) {
               int a = Integer.parseInt(args[0]);
               int b = Integer.parseInt(args[1]);
               int c = Integer.parseInt(args[2]);
               int d = Integer.parseInt(args[3]);

               System.out.println("Argument 1 -->" + a);
               System.out.println("Argument 2-->" + b);
               System.out.println("Argument 3-->" + c);
               System.out.println("Argument 4-->" + d);
           }
       }catch (Exception e){
           System.out.println("Printing no Arguments.");
           System.out.println("You Enter only four number's.");
       }
    }
}
