import java.time.LocalTime;

public class WatkiGodzina {
    public static void main(String[] args) throws InterruptedException {
        Runnable czasomierze = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(5000);
                    System.out.println(LocalTime.now());
                }
            } catch (InterruptedException e) {
            }
        };
        Thread watekCzasu = new Thread(czasomierze);
        watekCzasu.start();
        watekCzasu.join();
        System.out.println("Program kończy działanie...");
    }
}