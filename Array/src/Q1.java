public class Q1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,5,6,7};
        int [] b = {5,1,1};
        boolean result = isSubset(a,b);
        System.out.println(result);

    }
    public static boolean isSubset(int [] a, int [] b){
        boolean flag = true;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i] == a[j]) {
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
        }
        return flag;
    }
}
