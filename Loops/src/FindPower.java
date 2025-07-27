import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b  = sc.nextInt();
        int p = sc.nextInt();
        int ans = 1;
        for(int  i=1;i<=p;i++){
            ans = ans*b;
        }
        System.out.println(ans);
    }
}
