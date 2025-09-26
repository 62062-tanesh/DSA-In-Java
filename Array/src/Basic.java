public class Basic {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;
        int c = b--;
        a = ++b;
        int d = a + ++a + a++;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
