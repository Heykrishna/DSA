
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];


        // taking input

        // for(int i=0; i<=4; i++){
        //     arr[i] = sc.nextInt();
        // }

        // initializing individual arrays
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        
        arr[0] = 99;
        System.out.print(arr[0] + " ");

        for(int i=0; i<=4; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
