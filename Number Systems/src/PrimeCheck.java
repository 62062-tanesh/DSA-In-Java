import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=1;i<=k; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        int flag = 0;
        if(n == 1){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0) {
                flag++;
                break;
            }
        }
        if(flag == 0){
            return true;
        }else{
            return false;
        }
    }
}
