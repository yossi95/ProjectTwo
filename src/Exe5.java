import java.util.Scanner;

public class Exe5 {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arry2 = new int[10];
//        for (int i = 0; i < arry2.length; i++) {
//            System.out.println("Enter a number");
//            arry2[i] = scanner.nextInt();
//        }

        // int[] arry2 = {3, 1, 6, 11, 10, 9, 4, 2, 0};
        int[] arry2 = {1, 2, 3, 2, 1};
        int x = top(arry2);
        System.out.println(top(arry2));
    }

    public static int top(int[] arry) {
        //int j = 1;
        int result = 0;
        boolean up = true;
        for (int i = 0; i < arry.length - 1; i++) {
            if (arry[i] > arry[i + 1] && up) {
                up = false;
                result = i;
            }
            if (!up && arry[i] < arry[i + 1]) {
                return -1;
            }


        }
        return result;
    }
}