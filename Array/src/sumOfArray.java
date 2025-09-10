public class sumOfArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int sum = 0;
        for(int b : a){
            sum += b;
        }
        System.out.println("The Sum of the Array is: "+sum);
    }
}
