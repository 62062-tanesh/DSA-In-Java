import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.println("The Add is: "+sum);

        int product = productofNum(n);
        System.out.println("The Product is: "+product);
    }

    public static int productofNum (int n){
        int ans = 1;
        while(n>0){
            ans = ans * (n%10);
            n = n/10;
        }
        return ans;
    }
}
