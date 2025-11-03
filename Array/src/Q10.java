import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter The Third Number: ");
        int n3 = sc.nextInt();
        int secondLargest = -1;
        if(n1 >= n2 && n1 >= n3){
            if(n2 >= n3){
                secondLargest = n2;
            }
            else{
                secondLargest = n3;
            }

        } else if (n2 >= n1 && n2 >= n3) {
            if(n1 >= n3){
                secondLargest = n1;
            }
            else{
                secondLargest = n3;
            }
        }
        else{
            if(n1>=n2){
                secondLargest = n1;
            }
            else{
                secondLargest = n2;
            }
        }
        System.out.println("Second Largest number is: "+secondLargest);
    }
}
