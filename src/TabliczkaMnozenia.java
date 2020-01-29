public class TabliczkaMnozenia {
    public static void main(String[] args) {
        int x = 10, y = 10;
        for (int a = 1; a <= x; a++) {
            System.out.print("\t" + a);
        }
        System.out.println();
        for (int i = 1; i <= x; i++) {
            int c = 10;
            System.out.print(i);
            for (int j = 1; j <= y; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
    }
}
