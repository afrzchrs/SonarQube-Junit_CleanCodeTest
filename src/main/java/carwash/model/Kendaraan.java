package carwash.model;

import java.util.logging.Logger;

public abstract class Kendaraan {
    private static final Logger logger = Logger.getLogger(Kendaraan.class.getName());

    private String nomorKendaraan;
    private String tipeKendaraan;

    protected Kendaraan(String nomorKendaraan, String tipeKendaraan) {
        this.nomorKendaraan = nomorKendaraan;
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void infoKendaraan() {
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Tipe: %s", tipeKendaraan));
            logger.info(String.format("Nomor: %s", nomorKendaraan));
        }
    }
}

