public class Q8 {
    public static void main(String[] args) {
        int [] arr = {25,16,10,35,10,20,50};
        System.out.println(secondMaxElement(arr));
    }
    public static int secondMaxElement(int [] a){
        int max1 = a[0];
        int max2 = a[1];
        if(a[0]<a[1]){
            max1 = a[1];
            max2 = a[0];
        }
        for(int i=2; i<a.length;i++){
            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
            else{
                if(max2<a[i]){
                    max2 = a[i];
                }
            }
        }
        return max2;
    }
}
