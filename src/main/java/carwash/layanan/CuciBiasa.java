package carwash.layanan;

public class CuciBiasa implements LayananPencucian {
    @Override
    public int getHarga(String jenisMobil) {
        return switch (jenisMobil.toLowerCase()) {
            case "motor" -> 20000;
            case "mobil" -> 50000;
            default -> 0;
        };
    }

    @Override
    public String getDeskripsi() {
        return "Layanan: Cuci Biasa";
    }
}
