public class ConvertType {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double c = a/b;
        double d = (double)a/b; // convert a and b to c
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
