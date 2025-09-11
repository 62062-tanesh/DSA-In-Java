public class FactorialNew {
    public static void main(String[] args) {
        int n = 10;
        int fact1 = 1;
        for(int i=1; i<=n; i++){
            fact1 *= i;
        }
        System.out.println("Factorial is: "+fact1);
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
}
