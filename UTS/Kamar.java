package UTS;

public class Kamar {
    private int nomor;
    private int tarifPerMalam;
    private Pasien pasien;

    public Kamar(int nomor, int tarifPerMalam) {
        this.nomor = nomor;
        this.tarifPerMalam = tarifPerMalam;
    }

    public void isiPasien(Pasien p) { this.pasien = p; }
    public boolean isKosong() { return pasien == null; }
    public Pasien getPasien() { return pasien; }
    public int getNomor() { return nomor; }
    public int getTarifPerMalam() { return tarifPerMalam; }
}