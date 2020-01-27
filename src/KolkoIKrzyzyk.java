import java.util.Scanner;

public class KolkoIKrzyzyk {
    public static void main(String[] args) {
        int wymiar = 3;
        char[][] plansza = new char[wymiar][wymiar];
        int licznikRuchow = 0;
        char obecnyGracz = 'X';
        boolean wygrana = false;
        while (licznikRuchow < wymiar * wymiar && !wygrana) {
            drukujPlansze(plansza);
            boolean ruchPoprawny = wykonajRuch(plansza, obecnyGracz);
            if (ruchPoprawny) {
                licznikRuchow++;
                wygrana = sprawdzWygrana(plansza, obecnyGracz);
                obecnyGracz = obecnyGracz == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Ruch niepoprawny, spróbuj ponownie");
            }
        }
        drukujPlansze(plansza);
    }

    private static boolean sprawdzWygrana(char[][] plansza, char obecnysymbol) {
        return sprawdzSkos1(plansza, obecnysymbol) ||
                sprawdzSkos2(plansza, obecnysymbol) ||
                sprawdzKolumny(plansza, obecnysymbol) ||
                sprawdzWiersze(plansza, obecnysymbol);
    }

    private static boolean sprawdzSkos1(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][i] != symbol) {
                return false;
            }
        }
        System.out.println("Wygral gracz : " + symbol);
        return true;
    }

    private static boolean sprawdzSkos2(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][wymiar - i - 1] != symbol) {
                return false;
            }
        }
        System.out.println("Wygral gracz : " + symbol);
        return true;
    }

    private static boolean sprawdzWiersze(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            boolean wygrana = true;
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                System.out.println("Wygral gracz : " + symbol);
                return true;
            }
        }
        return false;
    }

    private static boolean sprawdzKolumny(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                System.out.println("Wygral gracz : " + symbol);
                return true;
            }
        }
        return false;
    }

    private static boolean wykonajRuch(char[][] plansza, char obecnyGracz) {
        System.out.println("Gracz: " + obecnyGracz + ", podaj wspolrzedne wiersza");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println("Gracz : " + obecnyGracz + ", podaj wspolrzedne kolumny");
        int kolumna = new Scanner(System.in).nextInt();

        if (wiersz < 3 && kolumna < 3 && wiersz >= 0 && kolumna >= 0 && plansza[wiersz][kolumna] == 0) {
            plansza[wiersz][kolumna] = obecnyGracz;
            return true;
        } else {
            return false;
        }
    }

    public static void drukujPlansze(char[][] plansza) {
        int wymiar = plansza.length;
        System.out.print("\t");
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            System.out.print(kolumna + "\t");
        }
        System.out.println();
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            System.out.print(wiersz + ":\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(plansza[wiersz][kolumna] + "\t");
            }
            System.out.println();
        }
    }
}

