import java.util.Scanner;

public class UnitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();
        while(num>9){
            int result = 0;
            while(num>0){
                result = result + (num%10);
                num = num/10;
            }
            num = result;
        }
        System.out.printf("The Answer is: %d",num);
    }
}
