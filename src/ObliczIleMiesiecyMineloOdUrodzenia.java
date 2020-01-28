import java.time.LocalDate;
import java.util.Scanner;

public class ObliczIleMiesiecyMineloOdUrodzenia {
    public static void main(String[] args) {
        System.out.println("Podaj rok urodzenia");
        int rokUrodzenia = new Scanner(System.in).nextInt();
        LocalDate rok = LocalDate.now();
        int obecnyRok = rok.getYear();
        System.out.println("Podaj Miesiac urodzenia");
        int miesiacUrodzenia = new Scanner(System.in).nextInt();
        int obecnyMiesiac = rok.getMonthValue();
        int wynik = ((obecnyRok - rokUrodzenia) * 12) + obecnyMiesiac - miesiacUrodzenia;
        System.out.println("Minelo " + wynik + " miesiecy, od twojego urodzenia");
    }
}


