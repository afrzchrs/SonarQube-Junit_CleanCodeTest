package carwash.layanan;

public class CuciSteam implements LayananPencucian {
    @Override
    public int getHarga(String jenisMobil) {
        return switch (jenisMobil.toLowerCase()) {
            case "motor" -> 30000;
            case "mobil" -> 70000;
            default -> 0;
        };
    }

    @Override
    public String getDeskripsi() {
        return "Layanan: Cuci Steam";
    }
}
