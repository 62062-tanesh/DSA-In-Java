import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str = sc.nextLine();
//        subString(str);
        printSubString(str);
    }
    public static void subString(String s){
        for(int i=0;i<s.length();i++){
            String temp = "";
            for(int j=i;j<s.length();j++){
                temp += s.charAt(j);
                System.out.println(temp);

            }
            System.out.println();
        }
    }
    public static void printSubString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length()+1;j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
