import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Usia : ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan Berat Badan : ");
        double beratBadan = scanner.nextDouble();

        System.out.print("Masukkan kadar hemoglobin : ");
        double hemoglobin = scanner.nextDouble();

        if (usia >= 17 ){
            System.out.println("--Anda Memenuhi Syarat Untuk Mendonorkan Darah--");
        } else if (usia > 65){
            System.out.println("--Anda Tidak Memenuhi Syarat Untuk Mendonorkan Darah--");
        }


        if (beratBadan >= 45 ){
            System.out.println("--Anda Memenuhi Syarat Untuk Mendonorkan Darah--");
        } else {
            System.out.println("--Anda Tidak Memenuhi Syarat Untuk Mendonorkan Darah--");
        }

        if (hemoglobin >= 12.5){
            System.out.println("--Anda Memenuhi Syarat Untuk Mendonorkan Darah--");
        } else if (hemoglobin < 17.0){
            System.out.println("--Anda Tidak Memenuhi Syarat Untuk Mendonorkan Darah--");
        }

            
        scanner.close();
}
}