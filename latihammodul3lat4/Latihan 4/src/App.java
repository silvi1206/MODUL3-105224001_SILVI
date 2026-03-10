import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = scanner.nextInt();

        System.out.print("Masukkan persentase absensi: ");
        int absensi = scanner.nextInt();

        String status = (nilai >= 75 && absensi >= 80) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status anda : " + status);

        scanner.close();
    }
}