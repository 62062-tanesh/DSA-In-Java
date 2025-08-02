import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("The Sum of The Digits are: "+sum);
        System.out.println();
    }
}
