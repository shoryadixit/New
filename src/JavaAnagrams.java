import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    private static boolean True;
    private static boolean False;

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.replace(" ","").toLowerCase();
        b = b.replace(" ","").toLowerCase();

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d)){
            return True;
        }
        else{
            return False;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
