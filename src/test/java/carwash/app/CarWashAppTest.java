package carwash.app;

import org.junit.jupiter.api.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CarWashAppTest {

    @Test
    public void testMainRunsAndCoversLogInfo() {
        // Paksa logger agar aktif di level INFO
        Logger logger = Logger.getLogger(CarWashApp.class.getName());
        logger.setLevel(Level.INFO);

        // Tambahkan handler jika belum ada
        if (logger.getHandlers().length == 0) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setLevel(Level.INFO);
            logger.addHandler(handler);
        }

        assertDoesNotThrow(() -> CarWashApp.main(new String[]{}));
    }
}
