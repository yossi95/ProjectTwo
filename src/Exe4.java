import java.util.Arrays;

public class Exe4 {
    public static void main(String[] args) {


       // int[] arry2 = {1, 3, 5, 3, 1};
        int[] arry2 = {1, 3, 5, 3, 1};
        System.out.println(Arrays.toString(duplication(arry2)));

    }

    public static int[] duplication(int[] arry) {
//        int[] temp = new int[arry.length];//0,0,0
        int right = arry.length - 1;
        int count = 0;
        for (int i = 0; i < arry.length; i++) {
            //check if exist
            System.out.println(Arrays.toString(arry));
            boolean exist = false;
            boolean enter = false;
            for (int j = i + 1; j < (arry.length - count); j++) {
                enter = true;
                if (arry[i] == arry[j]) {
                    int temp = arry[j];
                    arry[j] = arry[right];
                    arry[right] = temp;
                    right--;
                    count++;
                    exist = true;
                }
            }
            if (!enter) break;
            if (!exist) {
                count++;
            }


        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = arry[i];
        }

        return result;
    }


}


