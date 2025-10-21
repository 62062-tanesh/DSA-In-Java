import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println(sum);
    }
}
