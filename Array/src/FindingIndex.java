public class FindingIndex {
    public static void main(String[] args) {
        int [] arr = {2,4,6,10};
        int n = 6;
        System.out.println(findIndex(arr,n));
    }
    public static int findIndex(int [] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
