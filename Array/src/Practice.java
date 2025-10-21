import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,6,5,4,5,7};
        int n = 5;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
