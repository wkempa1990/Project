public class Choinka {
    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
