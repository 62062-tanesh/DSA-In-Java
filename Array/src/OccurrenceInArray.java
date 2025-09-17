import java.util.Scanner;

public class OccurrenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size  of The Array: ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter The Element you want to Search The Occurrence: ");
        int SearchElement = sc.nextInt();
        int ans = OccurrenceIs(arr, SearchElement);
        int ans2 = lastOccurrence(arr, SearchElement);
        int ans3 = greaterThanSearching(arr, SearchElement);
        System.out.print("The Occurrence Of The "+SearchElement+" is: "+ans);
        System.out.println();
        System.out.print("The Last Occurrence Of The "+SearchElement+" is: "+ans2);
        System.out.println();
        System.out.print("How Many Numbers are Strictly Greater Than "+SearchElement+" is: "+ans3);

    }
    public static int OccurrenceIs(int [] a, int b){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == b){
                count += 1;
            }
        }
        return count;
    }
    public static int lastOccurrence(int [] arr, int n){
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                index = i;
            }
        }
        return index;
    }
    public static int greaterThanSearching(int [] arr, int n){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > n){
                count += 1;
            }
        }
        return count;
    }


}
