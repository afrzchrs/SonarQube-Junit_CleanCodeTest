package carwash.service;

import carwash.layanan.CuciBiasa;
import carwash.layanan.LayananPencucian;
import carwash.model.Mobil;
import carwash.model.PelangganReguler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransaksiTest {

    @Test
    void testTransaksiBayar() {
        PelangganReguler pelanggan = new PelangganReguler("Andi", "08123456789");
        Mobil mobil = new Mobil("B 1234 XYZ");
        LayananPencucian layanan = new CuciBiasa();

        Transaksi transaksi = new Transaksi(pelanggan, mobil, layanan);

        assertFalse(transaksi.isSudahBayar());
        transaksi.bayar();
        assertTrue(transaksi.isSudahBayar());
    }

    @Test
    void testGetters() {
        PelangganReguler pelanggan = new PelangganReguler("Andi", "08123456789");
        Mobil mobil = new Mobil("B 1234 XYZ");
        LayananPencucian layanan = new CuciBiasa();

        Transaksi transaksi = new Transaksi(pelanggan, mobil, layanan);

        assertEquals(pelanggan, transaksi.getPelanggan());
        assertEquals(mobil, transaksi.getKendaraan());
    }

    @Test
    void testTampilkanStruk() {
        PelangganReguler pelanggan = new PelangganReguler("Andi", "08123456789");
        Mobil mobil = new Mobil("B 1234 XYZ");
        LayananPencucian layanan = new CuciBiasa();

        Transaksi transaksi = new Transaksi(pelanggan, mobil, layanan);

        // Method ini hanya log, pastikan tidak error saat dipanggil
        transaksi.tampilkanStruk("mobil");
    }
}
