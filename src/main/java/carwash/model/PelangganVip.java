package carwash.model;

import java.util.logging.Level;

public class PelangganVip extends Pelanggan {
    public PelangganVip(String nama, String nomorTelepon) {
        super(nama, nomorTelepon);
    }

    @Override
    public void tampilkanInfo() {
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Pelanggan Vip");
            logger.info(String.format("Nama: %s", nama));
            logger.info(String.format("Telepon: %s", nomorTelepon));
        }
    }
}