import java.util.Scanner;

public class RectangularBorderPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            while(j<n*2){
                if(j == 0 || j == (n*2)-1 || i == 0 || i == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
