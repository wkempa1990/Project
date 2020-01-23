import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Kalendarz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Wpisz miesiąc i rok [MM YYYY]: ");
            String str = sc.nextLine();
            String[] inputMatrix = str.split(" ");
            try {
                int mm = Integer.parseInt(inputMatrix[0]);
                int rr = Integer.parseInt(inputMatrix[1]);
                new KalendarzProdukcja(mm, rr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wpisano zla date, prosze sprbuj ponownie");
            } catch (Exception e) {
                System.out.println("Wpisano zla date, prosze sprbuj ponownie");
            }
        }
    }

    private static class KalendarzProdukcja {
        public KalendarzProdukcja(int mm, int rr) {
            LocalDate pierwszyDzienMiesiaca = LocalDate.of(rr, mm, 1);
            LocalDate pierwszyDzienMiesiacaNastepnego = pierwszyDzienMiesiaca.plusMonths(1);
            LocalDate ostatniDzienMiesiaca = pierwszyDzienMiesiacaNastepnego.plusDays(-1);
            DayOfWeek dzienTyg = pierwszyDzienMiesiaca.getDayOfWeek();
            int nrDzienTyg = dzienTyg.getValue();
            int dlugoscTablicy = ostatniDzienMiesiaca.getDayOfMonth() + nrDzienTyg;
            String[] tablica = new String[dlugoscTablicy];
            int n = 1;
            for (int x = 0; x < dlugoscTablicy; x++) {
                if (x < nrDzienTyg) {
                    tablica[x] = "  ";
                } else {
                    tablica[x] = String.format("%02d", n++);
                }
            }
            System.out.print("PN WT SR CZ PT SO ND");
            for (int x = 0; x < dlugoscTablicy; x++) {
                System.out.print(tablica[x] + " ");
                if (x % 7 == 0) {
                    System.out.println("");
                }
            }
        }
    }
}
