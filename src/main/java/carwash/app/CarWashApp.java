package carwash.app;

import carwash.layanan.CuciBiasa;
import carwash.layanan.CuciSteam;
import carwash.layanan.LayananPencucian;
import carwash.model.*;
import carwash.service.Transaksi;

import java.util.logging.Logger;
import java.util.logging.Level;

public class CarWashApp {
    private static final Logger logger = Logger.getLogger(CarWashApp.class.getName());

    @SuppressWarnings("java:S1172") 
    public static void main(String[] args) {
        // Buat pelanggan
        Pelanggan pelanggan1 = new PelangganReguler("Budi", "08123456789");
        Pelanggan pelanggan2 = new PelangganVip("Ani", "08987654321");

        // Buat kendaraan
        Kendaraan motorBudi = new Motor("AB1234CD");
        Kendaraan mobilAni = new Mobil("B5678EF");

        // Pilih layanan
        LayananPencucian layananBudi = new CuciBiasa();
        LayananPencucian layananAni = new CuciSteam();

        // Buat transaksi
        Transaksi transaksi1 = new Transaksi(pelanggan1, motorBudi, layananBudi);
        Transaksi transaksi2 = new Transaksi(pelanggan2, mobilAni, layananAni);

        // Tampilkan struk sebelum pembayaran
        transaksi1.tampilkanStruk(motorBudi.getTipeKendaraan());
        transaksi2.tampilkanStruk(mobilAni.getTipeKendaraan());

        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("%n%s%n", "Setelah pembayaran:"));
        }

        // Melakukan pembayaran
        transaksi1.bayar();
        transaksi2.bayar();

        // Tampilkan struk setelah pembayaran
        transaksi1.tampilkanStruk(motorBudi.getTipeKendaraan());
        transaksi2.tampilkanStruk(mobilAni.getTipeKendaraan());
    }
}
