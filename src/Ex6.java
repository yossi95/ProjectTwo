
public class Ex6 {

    public static void main(String[] args) {
        int[] arr1={2,5,6,7,5,2};
        int[] arr2= {10,8,3,8,1};
        int [] arr3 = arrCutting(arr1, arr2);
        printArr (arr1);
        printArr (arr2);
        printArr (arr3);

        System.out.println(strange(arr1, arr2));

    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static int[] arrCutting (int[] a, int[] b){
        int min;
        if (a.length < b.length)
            min= a.length;
        else
            min= b.length;
        int [] temp= new int [min];
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if (has(a,i) == false){
                for (int j = 0; j < b.length; j++) {
                    if (a[i]==b[j]){
                        temp[m] = a[i];
                        m++;
                        break;
                    }
                }
            }
        }
        int [] c= new int[m];
        for (int i = 0; i < c.length; i++) {
            c[i]= temp[i];
        }
        return c;
    }

    public static boolean has (int[] arr, int index){
        for (int i = 0; i < index; i++) {
            if(arr[i]==arr[index])
                return true;
        }
        return false;
    }

    public static boolean strange (int[]a , int[] b){
        int [] c = arrCutting(a, b);
        if (c.length == 0)
            return true;
        else
            return false;
    }
}
