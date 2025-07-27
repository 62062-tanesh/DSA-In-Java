import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int n= sc.nextInt();
        while(n>0){
            num = num*10 + (n%10);
            n = n/10;
        }
        System.out.println("The Reverse Of The Number is: "+num);
    }
}
