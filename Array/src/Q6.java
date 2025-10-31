import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = ArrayMethods.InputArray();
        System.out.print("Enter The Element You want to search in Array: ");
        int n = sc.nextInt();
        boolean ans = searchElement(a, n);
        System.out.println("The Element is Present in Array is: "+ans);
    }
    public static boolean searchElement(int [] a, int n){
        boolean flag = false;
        for(int i=0; i<a.length;i++){
            if(a[i]==n){
                flag = true;
            }
        }
        return flag;
    }
}
