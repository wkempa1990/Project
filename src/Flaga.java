public class Flaga {
    public static void main(String[] args) {
        String a = "* * * * * * ==================================";
        String b = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(a);
            System.out.println(" * * * * *  ==================================");
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(b);
        }
    }
}
