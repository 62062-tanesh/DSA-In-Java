import java.util.Scanner;

public class Factorial {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.println("The Factorial is: "+fact1(n));
        System.out.println("The Factorial is: "+fact2(n));
        for(int i=1; i<=n; i++){
            System.out.print(fact1(i)+" ");
        }
        System.out.println();
        Factorial a = new Factorial();
        a.printSmallAlphabet();
        a.printCapitalAlphabet();


    }
    public static int fact1(int n){
        int sum = 1;
        while(n>0){
            sum = sum * n;
            n--;
        }
        return sum;
    }
    public static int fact2(int n){
        if(n==0 || n == 1){
            return 1;
        }
        else {
            return n* fact2(n-1);
        }
    }
    public void printSmallAlphabet(){
        int i = 97;
        while(i<123){
            System.out.print((char)i+" ");
            i++;
        }
        System.out.println();
    }

    public void printCapitalAlphabet(){
        int i = 65;
        while(i<91){
            System.out.print((char)i+" ");
            i++;
        }
        System.out.println();
    }
}
