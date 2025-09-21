
public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {12, 36, 56, 13, 27, 86, 54, 76, 98};
        int n = arr.length;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 35 ){
                System.out.print(i + " ");
            }
        }
    }
}
