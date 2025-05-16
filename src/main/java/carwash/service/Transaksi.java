package carwash.service;

import carwash.model.Kendaraan;
import carwash.model.Pelanggan;
import carwash.layanan.LayananPencucian;

import java.util.logging.Logger;

public class Transaksi {
    private static final Logger logger = Logger.getLogger(Transaksi.class.getName());

    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private LayananPencucian layanan;
    private boolean sudahBayar;

    public Transaksi(Pelanggan pelanggan, Kendaraan kendaraan, LayananPencucian layanan) {
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.layanan = layanan;
        this.sudahBayar = false;
    }

    public void tampilkanStruk(String jenisKendaraan) {
        logger.info("--- STRUK PENCUCIAN ---");
        pelanggan.tampilkanInfo();
        kendaraan.infoKendaraan();
        logger.info("Layanan: " + layanan.getDeskripsi());
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Harga: Rp%d", layanan.getHarga(jenisKendaraan)));
        }
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Status Pembayaran: %s", sudahBayar ? "Sudah Dibayar" : "Belum Dibayar"));
        }
    }

    public boolean isSudahBayar() {
        return sudahBayar;
    }

    public void bayar() {
        this.sudahBayar = true;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}
