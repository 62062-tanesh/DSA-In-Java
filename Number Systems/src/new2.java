import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pw = 1;
        while(n>0){
            int r = n%10;
            sum = sum + (r*pw);
            n = n/10;
            pw = pw*2;
        }
        System.out.println(sum);
    }
}
