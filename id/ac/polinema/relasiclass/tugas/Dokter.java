package id.ac.polinema.relasiclass.tugas;

public class Dokter {
    private String nip;
    private String nama;

    // Tambahkan / pastikan konstruktor ini ada!
    public Dokter(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void resepkanObat(Pasien pasien, Obat obat) {
        System.out.println("Dokter " + nama + " meresepkan obat " + obat.info() + " kepada pasien " + pasien.getNama());
    }

    public String info() {
        return "Dokter: " + nama + " (NIP: " + nip + ")";
    }
}