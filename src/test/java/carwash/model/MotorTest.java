package carwash.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorTest {

    @Test
    void testMotorConstructorAndGetters() {
        String nomor = "D5678ABC";
        Motor motor = new Motor(nomor);

        assertEquals(nomor, motor.getNomorKendaraan());
        assertEquals("Motor", motor.getTipeKendaraan());  // Huruf M besar sesuai constructor
    }
}
