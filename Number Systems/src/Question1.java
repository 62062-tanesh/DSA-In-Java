import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int a = sc.nextInt();
        int p = 1;
        int result = 0;
        while(a>0){
            int r = a%10;
            result = result + (r*p);
            a = a/10;
            p = p*2;
        }
        System.out.printf("The Answer is: %d",result);

    }
}
