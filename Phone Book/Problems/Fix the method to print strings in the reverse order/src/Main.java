import java.util.Scanner;

public class Main {

    /* Fix this method */

        static void printReverseCharByChar(String str)
        {
            if ((str==null)||(str.length() <= 1))
                System.out.println(str);
            else
            {
                System.out.print(str.charAt(str.length()-1));
                printReverseCharByChar(str.substring(0,str.length()-1));
            }
        }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}