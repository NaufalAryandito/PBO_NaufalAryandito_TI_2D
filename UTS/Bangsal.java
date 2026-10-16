package UTS;

public class Bangsal {
    private String nama;
    private Kamar[] kamar;
    private Dokter kepala;

    public Bangsal(String nama, int jumlahKamar, int tarifPerMalam) {
        this.nama = nama;
        kamar = new Kamar[jumlahKamar];
        for (int i = 0; i < jumlahKamar; i++) {
            kamar[i] = new Kamar(i + 1, tarifPerMalam);   // KOMPOSISI
        }
    }

    public void setKepala(Dokter d) { this.kepala = d; }
    public Dokter getKepala() { return kepala; }
    public String getNama() { return nama; }

    public Kamar getKamar(int nomor) {
        if (nomor < 1 || nomor > kamar.length) return null;   // guard clause indeks
        return kamar[nomor - 1];
    }

    public void rawatInap(Pasien p) {
        if (p == null) return;
        for (Kamar k : kamar) {
            if (k.isKosong()) {
                k.isiPasien(p);
                return;
            }
        }
        System.out.println("Semua kamar penuh.");
    }

    // overloading: ke kamar tertentu
    public void rawatInap(Pasien p, int nomor) {
        Kamar k = getKamar(nomor);
        if (p == null || k == null) {
            System.out.println("Data tidak valid.");
            return;
        }
        if (!k.isKosong()) {
            System.out.println("Kamar " + nomor + " sudah terisi.");
            return;
        }
        k.isiPasien(p);
    }
}