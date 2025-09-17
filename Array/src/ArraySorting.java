public class ArraySorting {
    public static void main(String[] args) {
        int [] a = {1,3,2,4};
        boolean ans = isSorted(a);
        if(ans){
            System.out.println("The Array is Sorted");
        }
        else{
            System.out.println("The Array is Not Sorted");
        }
    }

    public static boolean isSorted(int [] a){
        boolean ans = false;
        for(int i=0; i<a.length-1; i++){
            if(a[i] < a[i+1] || a[i] > a[i+1]){
                ans = true;
            }
            else{
                return false;
            }
        }
        return ans;
    }
}
