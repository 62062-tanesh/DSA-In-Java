import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pw = 1;
        while (n>0){
            int r = n%2;
            sum = sum + (r*pw);
            n = n/2;
            pw = pw*10;
        }
        System.out.println(sum);
    }
}
