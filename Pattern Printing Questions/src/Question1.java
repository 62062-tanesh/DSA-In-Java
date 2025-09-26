import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        int ans = reverse(n);
        System.out.println("The Reverse is: "+ans);

    }

    public static int productofNum (int n){
        int ans = 1;
        while(n>0){
            ans = ans * (n%10);
            n = n/10;
        }
        return ans;
    }


    public static void evenNums(int n){
        while(n>0){
            if((n%10)%2 == 0){
                System.out.println(n%10);
            }
            n = n/10;
        }
    }

    public static int reverse(int n){
        int count = 0;
        while(n>0){
            count = (count * 10) + (n%10);
            n = n/10;
        }
        return count;
    }
}
