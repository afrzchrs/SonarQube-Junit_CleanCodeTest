package carwash.layanan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuciBiasaTest {

    private final CuciBiasa cuciBiasa = new CuciBiasa();

    @Test
    void testHargaUntukMotor() {
        assertEquals(20000, cuciBiasa.getHarga("motor"));
    }

    @Test
    void testHargaUntukMobil() {
        assertEquals(50000, cuciBiasa.getHarga("mobil"));
    }

    @Test
    void testHargaUntukJenisTakDikenal() {
        assertEquals(0, cuciBiasa.getHarga("truk"));
    }

    @Test
    void testDeskripsi() {
        assertEquals("Layanan: Cuci Biasa", cuciBiasa.getDeskripsi());
    }
}
