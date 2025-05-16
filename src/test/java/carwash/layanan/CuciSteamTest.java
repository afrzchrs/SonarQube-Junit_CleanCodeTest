package carwash.layanan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuciSteamTest {

    private final CuciSteam cuciSteam = new CuciSteam();

    @Test
    void testHargaUntukMotor() {
        assertEquals(30000, cuciSteam.getHarga("motor"));
    }

    @Test
    void testHargaUntukMobil() {
        assertEquals(70000, cuciSteam.getHarga("mobil"));
    }

    @Test
    void testHargaUntukJenisTakDikenal() {
        assertEquals(0, cuciSteam.getHarga("bus"));
    }

    @Test
    void testDeskripsi() {
        assertEquals("Layanan: Cuci Steam", cuciSteam.getDeskripsi());
    }
}
