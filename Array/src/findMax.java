public class findMax {
    public static void main(String[] args) {
        int [] arr = {4,-106,-3,2,8};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The Maximum Element is: "+max);
    }
}
