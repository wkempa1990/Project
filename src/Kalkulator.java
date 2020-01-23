import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe :");
        int x = liczba.nextInt();
        System.out.println("Podaj druga liczbe:");
        int y = liczba.nextInt();
        System.out.println("Jakie dzialanie wykonac?\n" +
                "+ (Dodawanie)\n" +
                "- (Odejmowanie)\n" +
                "* (Mnozenie)\n" +
                "/ (Dzielenie)");
        liczba.nextLine();
        String z = liczba.nextLine();
        switch (z) {
            case "+":
                System.out.println("wynik :" + " " + (x + y));
                break;
            case "-":
                System.out.println("wynik :" + " " + (x - y));
                break;
            case "*":
                System.out.println("wynik :" + " " + (x * y));
                break;
            case "/":
                System.out.println("wynik :" + " " + (x / y));
                break;
            default:
                System.out.println("Niepoprawny znak");
        }
    }
}
