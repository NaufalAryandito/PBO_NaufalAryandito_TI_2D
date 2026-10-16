package id.ac.polinema.relasiclass.tugas;

public class Pasien {
    private String rekamMedis;
    private String nama;

    public Pasien(String rekamMedis, String nama) {
        this.rekamMedis = rekamMedis;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        return "Pasien: " + nama + " [No. RM: " + rekamMedis + "]";
    }
}