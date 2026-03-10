import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < 3) {
            System.out.print("Masukkan PIN anda: ");
            int pin = scanner.nextInt();

            if (pin == 123456) {
                System.out.println("PIN benar");
                break;
            } else {
                i++;
                
                if (i == 3) {
                    System.out.println("Akun diblokir.");
                } else {
                    System.out.println("PIN salah, coba lagi.");
                }
            }
        }

        scanner.close();
    }
}
   


