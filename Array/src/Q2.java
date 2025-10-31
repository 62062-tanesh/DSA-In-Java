public class Q2 {
    public static void main (String[] args){
        int [] a = {10,8,5,7,4,5};
        int ans = maxElement(a);
        System.out.println(ans);

    }
    public static int maxElement(int [] a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
