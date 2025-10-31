public class Q7 {
    public static void main(String[] args){
        int [] a = ArrayMethods.InputArray();
        ArrayMethods.PrintArray(a);
        int [] ans = reverseArray(a);
        ArrayMethods.PrintArray(ans);
    }
    public static int [] reverseArray(int [] a){
        int i=0, j=a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
