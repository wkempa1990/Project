import java.util.Scanner;

public class MiedzyCyframi {
    public static void main(String[] args) {
        System.out.println("Podaj cyfre od 1 do 9  : ");
        int cyfra = new Scanner(System.in).nextInt();
        System.out.println("Podaj liczbe maksymalnie czterocyfrowa:");
        int liczba = new Scanner(System.in).nextInt();
        if (cyfra < 10 && cyfra > 0) {
            if (liczba == 0) {
                System.out.println(cyfra + "" + 0);
            } else if (liczba <= 9 && liczba >= 1) {
                System.out.println(cyfra + "" + liczba);
                System.out.println(liczba + "" + cyfra);
            } else if (liczba <= 99 && liczba >= 10) {
                int reszta = liczba % 10;
                System.out.println(cyfra + "" + liczba);
                System.out.println(liczba / 10 + "" + cyfra + "" + reszta);
                System.out.println(liczba + "" + cyfra);
            } else if (liczba <= 999 && liczba >= 100) {
                int reszta = liczba % 100;
                int reszta1 = liczba % 10;
                System.out.println(cyfra + "" + liczba);
                System.out.println(liczba / 100 + "" + cyfra + "" + reszta);
                System.out.println(liczba / 10 + "" + cyfra + "" + reszta1);
                System.out.println(liczba + "" + cyfra);
            } else if (liczba <= 9999 && liczba >= 1000) {
                int reszta = liczba % 1000;
                int reszta1 = liczba % 100;
                int reszta2 = liczba % 10;
                System.out.println(cyfra + "" + liczba);
                System.out.println(liczba / 1000 + "" + cyfra + "" + reszta);
                System.out.println(liczba / 100 + "" + cyfra + "" + reszta1);
                System.out.println(liczba / 10 + "" + cyfra + "" + reszta2);
                System.out.println(liczba + "" + cyfra);
            } else {
                System.out.println("Podaj liczbe maksymalnie czterocyfrowa");
            }
        } else {
            System.out.println("Podano zla cyfre ");
        }
    }
}
