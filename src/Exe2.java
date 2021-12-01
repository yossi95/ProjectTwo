import java.util.Scanner;

public class Exe2 {

    public static void main(String[]args){

        biggerthanaverege();
    }

    public static void biggerthanaverege(){
        int[] arry={1,2,3,4,5,6,7,8,9,10};
int sum=0;

    for (int i=0; i<arry.length; i++) {
        sum = sum + arry[i];
    }
        double averge=sum/10;
        for (int j=0; j<arry.length; j++)
        if (arry[j]>averge){

            System.out.println(arry[j]);

        }

    }


}



