package carwash.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobilTest {

    @Test
    void testMobilConstructorAndGetters() {
        String nomor = "B1234XYZ";
        Mobil mobil = new Mobil(nomor);

        assertEquals(nomor, mobil.getNomorKendaraan());
        assertEquals("Mobil", mobil.getTipeKendaraan());  // Huruf M besar sesuai constructor
    }
}
