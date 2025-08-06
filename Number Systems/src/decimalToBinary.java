import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DecimalNo = sc.nextInt();
        int binaryNo = 0;
        int pw = 1;
        while(DecimalNo > 0){
            int rem = DecimalNo % 2;
            binaryNo = binaryNo + (rem*pw);
            pw *= 10;
            DecimalNo /= 2;
        }
        System.out.println(binaryNo);
    }
}
