import java.util.Scanner;

public class App{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vip = 5;
        int festival = 25;
        int tribune = 35;
        int hargaVip = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;
        int pilihan;

        while (true) {

            System.out.println("=== SOUNDFEST 2026 ===");
            System.out.println("Stok VIP : " + vip);
            System.out.println("Stok Festival : " + festival);
            System.out.println("Stok Tribun : " + tribune);
            System.out.println("1. VIP");
            System.out.println("2. Festival");
            System.out.println("3. Tribun");
            System.out.println("4. Matikan Mesin");

            System.out.print("Pilih menu : ");
            pilihan = scanner.nextInt();

            if (pilihan == 4) {
                System.out.println("Mesin dimatikan");
                break;
            }

            int stok = 0;
            int harga = 0;
            int minUmur = 0;
            String jenis = " ";

            if (pilihan == 1) {
                stok = vip;
                harga = hargaVip;
                minUmur = 18;
                jenis = "VIP";
            } else if (pilihan == 2) {
                stok = festival;
                harga = hargaFestival;
                minUmur = 15;
                jenis = "Festival";
            } else if (pilihan   == 3) {
                stok = tribune;
                harga = hargaTribune;
                minUmur = 0;
                jenis = "Tribune";
            } else {
                System.out.println("Menu tidak ada");
                continue;
            }

            System.out.print("Jumlah tiket : ");
            int jumlah = scanner.nextInt();

            if (jumlah > stok) {
                System.out.println("Stok tidak cukup");
                continue;
            }

            int berhasil = 0;
            int total = 0;

            for (int i = 1; i <= jumlah; i++) {

                int umur;

                while (true) {
                    System.out.print("Usia tiket ke-" + i + " : ");
                    umur = scanner.nextInt();

                    if (umur == -1) {
                        System.out.println("Transaksi dibatalkan");
                        break;
                    }

                    if (umur <= 0 || umur > 120) {
                        System.out.println("Usia tidak valid / logis, masukkan lagi");
                    } else {
                        break;
                    }
                }

                if (umur == -1) {
                    break;
                }

                if (umur >= minUmur) {
                    berhasil++;
                    total += harga;
                    System.out.println("Tiket diterima");
                } else {
                    System.out.println("Tidak memenuhi syarat usia");
                }
            }

            if (berhasil > 0) {
                System.out.println("--- Nota Pembelian ---");
                System.out.println("Jenis tiket : " + jenis);
                System.out.println("Tiket berhasil : " + berhasil);
                System.out.println("Total bayar : Rp " + total);
            }

            if (pilihan == 1) {
                vip -= berhasil;
            } else if (pilihan == 2) {
                festival -= berhasil;
            } else if (pilihan == 3) {
                tribune -= berhasil;
            }

        }

        scanner.close();
    }
}