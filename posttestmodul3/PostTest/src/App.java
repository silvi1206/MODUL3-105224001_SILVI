import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int saldoawal = 500000;
        int minimalsaldo = 50000;
        int pilihan;

        do{
        System.out.println("== SELAMAT DATANG ==");
        System.out.println("-- MENU -- ");
        System.out.println("1. Cek Saldo" );
        System.out.println("2. Setor Tunai");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Keluar");       
        System.out.print("Masukkan pilihan : ");
        pilihan = scanner.nextInt();   

        switch(pilihan){
            case 1:
                System.out.print("Saldo Anda: " +"Rp " + saldoawal);
                break;
            case 2:
                System.out.print("Masukkan Jumlah Setor Tunai: ");
                int setor = scanner.nextInt();
                saldoawal += setor;
                System.out.println("Saldo Anda: " + "Rp " + saldoawal);
                break;
            case 3:
                System.out.print("Masukkan Jumlah Tarik Tunai: ");
                int tarik = scanner.nextInt();
                    if(saldoawal - tarik < minimalsaldo){
                    System.out.println("Saldo Anda Tidak Mencukupi Untuk Melakukan Tarik Tunai");

                } else if (saldoawal - tarik >= minimalsaldo){
                    saldoawal -= tarik;
                    System.out.println("Saldo Anda: " + "Rp " + saldoawal);
            
                } else {
                    System.out.println("Saldo Anda Tidak Mencukupi Untuk Melakukan Tarik Tunai");
                }
                break;
            case 4:
                System.out.println("Anda Keluar Dari ATM");
                break;
            
            default:
                System.out.println("Pilihan Tidak Valid");
            }
        } while (pilihan != 4);
        System.out.println(" Terima Kasih Telah Menggunakan ATM Kami");
        scanner.close();
    }

    }


    
    



