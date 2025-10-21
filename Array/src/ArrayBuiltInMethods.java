import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuiltInMethods {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,7,8,9,5,44};
        int [] arr2 = Arrays.copyOf(arr,5);
        ArrayMethods.PrintArray(arr2);
    }
}
