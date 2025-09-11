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
        System.out.print("The Occurrence Of The "+SearchElement+" is: "+ans);

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
}
