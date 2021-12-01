
import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
boolean isEquals;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter str1");
        String str1 = scanner.nextLine();
        System.out.println("Enter str2");
        String str2 = scanner.nextLine();

       isEquals=equals(str1, str2);

System.out.println(isEquals);

    }

    public static boolean equals(String str1, String str2) {

        for (int i = 0; i < str2.length(); i++) {


            if (str1.charAt(i) != str2.charAt(i)) {
                return false;

            }

        }
            return true;

    }


}