import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A Number: ");
        int n1 = sc.nextInt();
        int res = 0;
        while(n1 > 0){
            res += n1%10;
            n1 = n1/10;
        }
        System.out.println("The Sum of the All digits is: "+res);
    }
}
