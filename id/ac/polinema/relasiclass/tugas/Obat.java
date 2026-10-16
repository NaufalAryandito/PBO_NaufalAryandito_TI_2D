package id.ac.polinema.relasiclass.tugas;

public class Obat {
    private String namaObat;
    private String dosis;

    public Obat(String namaObat, String dosis) {
        this.namaObat = namaObat;
        this.dosis = dosis;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public String getDosis() {
        return dosis;
    }

    public String info() {
        return namaObat + " (" + dosis + ")";
    }
}