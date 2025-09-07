public class ArrayExample {
    public static void main(String[] args) {
        int [] ages = new int [5];
        ages[0] = 12;
        ages[1] = 30;
        ages[2] = 20;
        ages[3] = 15;
        ages[4] = 25;

        for(int i=0;  i<ages.length; i++){
            System.out.print(ages[i]+" ");
        }
        System.out.println();

    }
}
