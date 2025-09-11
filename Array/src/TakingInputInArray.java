import java.util.Scanner;

public class TakingInputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int  [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);


    }
    public static  void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
