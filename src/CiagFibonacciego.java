import java.util.Scanner;

public class CiagFibonacciego {
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        System.out.println("Podaj liczbe ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(" To liczba ciagu Fibonacciego");
        for (int i = 0; i < x; ++i) {
            c = a;
            a = b;
            b += c;
            System.out.println(c);
        }
    }
}
