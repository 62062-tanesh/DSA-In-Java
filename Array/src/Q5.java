public class Q5 {
    public static void main(String[] args) {
        int [] a = ArrayMethods.InputArray();
        System.out.println("Even Numebers In the Array: "+countEven(a));
        System.out.println("Odd Numebers In the Array: "+countOdd(a));

    }
    public static int countEven(int [] a){
        int Even = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                Even++;
            }
        }
        return Even;
    }
    public static int countOdd(int [] a){
        int Odd = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 != 0){
                Odd++;
            }
        }
        return Odd;
    }
}
