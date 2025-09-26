import java.util.Scanner;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = FindingIndex.inputArray(size);
        int [] ans = LargestAndSmallestElement(arr);
        FindingIndex.displayArray(arr);
        FindingIndex.displayArray(ans);
        System.out.println(kthLargestAndSmallestElement(arr,2));

    }
    public static int [] LargestAndSmallestElement(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int [] a = new int [2];
        a[0] = arr[0];
        a[1] = arr[arr.length-1];
        return a;
    }

    public static int  kthLargestAndSmallestElement(int [] arr, int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int [] a = new int [2];
        a[0] = arr[0];
        a[1] = arr[arr.length-1];
        return arr[k-1];
    }
}
