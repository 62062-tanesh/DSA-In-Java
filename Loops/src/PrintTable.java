import java.util.Scanner;
class PrintTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] arr = new int [T];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            Table(arr[i]);
        }
    }
    public static void Table(int n){
        for(int i=1; i<11; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        System.out.println("===============");
    }
}