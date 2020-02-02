import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ObliczIleZostaloDniDoTwoichUrodzin {
    public static void main(String[] args) {
        boolean a = true;
        while (a)
            try {
                System.out.println("Podaj rok nastepnych urodzin: ");
                int rok = new Scanner(System.in).nextInt();
                System.out.println("Podaj miesiac urodzin: ");
                int miesiac = new Scanner(System.in).nextInt();
                System.out.println("Podaj dzien urodzin: ");
                int dzien = new Scanner(System.in).nextInt();
                LocalDate dataurodzenia = LocalDate.of(rok, miesiac, dzien);
                long days = LocalDate.now().until(dataurodzenia, ChronoUnit.DAYS);
                System.out.print("Pozostalo " + days + " dni do twoich urodzin");
                break;
            } catch (InputMismatchException ex1) {
                System.out.println("Podana wartość nie jest liczbą");
            }
    }
}
