package carwash.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PelangganRegulerTest {

    @Test
    void testConstructorAndGetters() {
        String nama = "Andi";
        String telepon = "08123456789";
        PelangganReguler pelanggan = new PelangganReguler(nama, telepon);

        assertEquals(nama, pelanggan.getNama());
        assertEquals(telepon, pelanggan.getNomorTelepon());
    }

    @Test
    void testTampilkanInfo() {
        PelangganReguler pelanggan = new PelangganReguler("Budi", "08987654321");
        // Hanya memastikan method bisa dijalankan tanpa error
        pelanggan.tampilkanInfo();
    }
}
