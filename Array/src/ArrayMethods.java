import java.util.Scanner;

public class ArrayMethods {
    public static void InputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the Array: ");
        int size = sc.nextInt();
        System.out.println("Enter The "+size+" Elements");
        int [] arr = new int [size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void PrintArray(int [] arr){
        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
