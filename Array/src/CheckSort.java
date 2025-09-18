import java.util.Scanner;

public class CheckSort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = FindingIndex.inputArray(size);
        System.out.println(isSorted(arr));

    }
    public static boolean isSorted(int [] arr){
        boolean result = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}
