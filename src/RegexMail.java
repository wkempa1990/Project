import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexMail {
    public static void main(String[] args) {
        System.out.println("Podaj maila : ");
        String a = new Scanner(System.in).nextLine();
        boolean matches = Pattern.matches("([A-Za-z]+)@([A-Za-z]+)((\\.([A-Za-z]{2,3})){1,2})", a);
        if (matches == true) {
            System.out.println("Podano poprawnego maila : " + a);
        } else {
            System.out.println("Podano niepoprawnego maila : " + a);
        }
    }
}