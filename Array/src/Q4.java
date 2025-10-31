public class Q4 {
    public static void main(String[] args) {
        int [] arr = ArrayMethods.InputArray();
        System.out.println(sumOfArray(arr));

    }
    public static int sumOfArray(int [] a){
        int sum = 0;
        for(int i=0; i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }

}
