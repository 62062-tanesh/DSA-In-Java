public class ArrayExample {
    public static void main(String[] args) {
//        int [] ages = new int [5];
//        ages[0] = 12;
//        ages[1] = 30;
//        ages[2] = 20;
//        ages[3] = 15;
//        ages[4] = 25;
//
//        for(int i=0;  i<ages.length; i++){
//            System.out.print(ages[i]+" ");
//        }
//        System.out.println();
        ArrayExample obj = new ArrayExample();
        obj.multiArray();

    }

    public void multiArray(){
        int [][] arr =  new int[5][3];
        int [][] arr1 = {{5,4,3},{8,4,9},{3,4,5}};
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
