package carwash.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PelangganVipTest {

    @Test
    void testConstructorAndGetters() {
        String nama = "Citra";
        String telepon = "08991234567";
        PelangganVip pelanggan = new PelangganVip(nama, telepon);

        assertEquals(nama, pelanggan.getNama());
        assertEquals(telepon, pelanggan.getNomorTelepon());
    }

    @Test
    void testTampilkanInfo() {
        PelangganVip pelanggan = new PelangganVip("Dewi", "08765432109");
        // Pastikan method jalan tanpa error
        pelanggan.tampilkanInfo();
    }
}
