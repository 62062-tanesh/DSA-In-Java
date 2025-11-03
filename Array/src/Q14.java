/* print the input integer with seprate spaces with arraylist*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);

        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n = n/10;
        }
        Collections.reverse(list);

        for(int num : list){
//            System.out.print(num+" ");
        }

    }
    public static void printDigits(int n){
        if (n == 0){
            return;
        }
        printDigits(n/10);
        System.out.println(n%10 + " ");
    }
}
