public class Flaga {
    public static void main(String[] args) {
        String a = "* * * * * * ==================================";
        String b = "==============================================";
        String c =" * * * * *  ==================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(a);
            System.out.println(c);
        }
        System.out.println(a);
        for (int i = 0; i < 6; i++) {
            System.out.println(b);
        }
    }
}
