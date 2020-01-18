import java.util.Scanner;

public class Kalkulator { public static void main(String[] args) {
    int x, y, z;
    Scanner liczba = new Scanner(System.in);
    System.out.println("Podaj pierwsza liczbe:");
    x = liczba.nextInt();
    System.out.println("Podaj druga liczbe:");
    y = liczba.nextInt();
    System.out.println("Wybierz liczbe by wykonac dzialanie :(1:dodawanie" +
            " ,2: odejmowanie" +
            " ,3: mnozenie" +
            " ,4: dzielenie" +
            " ,5: sprawdz czy suma liczb jest parzysta" +
            ",6: pierwiastek z sumy podanych liczb )");
    z = liczba.nextInt();
    if (z == 1) {
        int suma = x + y;
        System.out.println("Dodawanie : " + suma);
    } else if (z == 2) {
        int roznica = x - y;
        System.out.println("Odejmowanie : " + roznica);
    } else if (z == 3) {
        double mnozenie = x * y;
        System.out.println("Mnozenie : " + mnozenie);
    } else if (z == 4) {
        double dzielenie = x / y;
        System.out.println("Dzielenie : " + dzielenie);
    } else if (z == 5) {
        boolean resztaZdzielenia = (x + y) % 2 == 0;
        System.out.println("Suma liczb jest parzysta : " + resztaZdzielenia);
    } else if (z == 6) {
        Math.sqrt(x + y);
        System.out.println("Pierwiastek z sumy liczb : " + Math.sqrt(x + y));
    } else {
        System.out.println(" Niepoprawne dzialanie");
    }

}
}
