package carwash.model;

import java.util.logging.Logger;

public abstract class Pelanggan {
    protected String nama;
    protected String nomorTelepon;

    protected static final Logger logger = Logger.getLogger(Pelanggan.class.getName());

    protected Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public abstract void tampilkanInfo();
}
