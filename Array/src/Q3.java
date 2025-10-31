public class Q3 {
    public static void main(String[] args) {
        int [] a = {7,5,8,6,2,4,7};
        System.out.println(minElement(a));
    }
    public static int minElement(int [] a){
        int min = a[0];
        for(int i=0; i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
}
