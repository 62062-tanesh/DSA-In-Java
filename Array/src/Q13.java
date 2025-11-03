/* Print the input integer with seprate spaces*/

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int store = 0 ;
        while(n>0){
            store = store * 10 + (n%10);
            n = n/10;
        }
//        System.out.println(store);
        while(store > 0){
            System.out.print((store%10)+" ");
            store = store/10;
        }
    }
}
