import java.util.Scanner;

public class FindingIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int size = sc.nextInt();
        int [] a = inputArray(size);
        int n = 6;
        displayArray(a);
        System.out.println(GreaterElements(a, n));
//        System.out.println(findIndex(a,n));
//        System.out.println(lastOccurance(a,n));
    }
    public static int findIndex(int [] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurance(int [] a, int n){
        int ans = -1;
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                ans = i;
            }
        }
        return ans;
    }
    public static int GreaterElements(int [] a, int n){
        int count = 0;
        for(int x : a){
            if(x > n){
                count ++;
            }
        }
        return count;
    }
    public static int [] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void displayArray(int [] a){
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
