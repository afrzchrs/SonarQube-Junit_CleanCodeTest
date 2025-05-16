package carwash.model;

import java.util.logging.Level;

public class PelangganReguler extends Pelanggan {
    public PelangganReguler(String nama, String nomorTelepon) {
        super(nama, nomorTelepon);
    }

    @Override
    public void tampilkanInfo() {
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Pelanggan Reguler");
            logger.info(String.format("Nama: %s", nama));
            logger.info(String.format("Telepon: %s", nomorTelepon));
        }
    }
}
