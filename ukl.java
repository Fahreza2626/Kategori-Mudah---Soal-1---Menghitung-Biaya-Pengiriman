import java.util.Scanner;
public class ukl{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaPengiriman = berat * biayaPerKg;
        double biayaTambahan = 0;

        if (volume > 100) {
            biayaTambahan = 50000;
        }

        double totalBiaya = biayaPengiriman + biayaTambahan;

        System.out.println("\n=== Rincian Biaya Pengiriman ===");
        System.out.println("Berat paket     : " + berat + " kg");
        System.out.println("Jarak tempuh    : " + jarak + " km");
        System.out.println("Volume paket    : " + volume + " cm^3");
        System.out.println("Biaya per kg    : Rp " + biayaPerKg);
        System.out.println("Biaya tambahan  : Rp " + biayaTambahan);
        System.out.println("----------------------------------");
        System.out.println("Total biaya kirim : Rp " + totalBiaya);

    }
}