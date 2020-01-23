import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe :");
        double x = liczba.nextDouble();
        System.out.println("Podaj druga liczbe:");
        double y = liczba.nextDouble();
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
                if(x==0 || y==0){
                    System.out.println("Nie dziel przez zero ...");
                }else{
                System.out.println("wynik :" + " " + (x / y));
                }break;
            default:
                System.out.println("Niepoprawny znak");
        }
    }
}
