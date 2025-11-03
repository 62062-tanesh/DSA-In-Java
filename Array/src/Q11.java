import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double n1 = sc.nextDouble();
        int sqrt = (int)(Math.sqrt(n1));
        System.out.println(sqrt);
        if(sqrt * sqrt == n1){
            System.out.println("Sucuss");
        }
        else{
            System.out.println("Failure");
        }

    }
}
