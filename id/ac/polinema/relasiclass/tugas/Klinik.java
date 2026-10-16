package id.ac.polinema.relasiclass.tugas;

public class Klinik {
    private String namaKlinik;
    private Dokter dokterUtama;
    private Pasien pasien;

    // Deklarasikan 3 parameter: namaKlinik, nipDokter, namaDokter
    public Klinik(String namaKlinik, String nipDokter, String namaDokter) {
        this.namaKlinik = namaKlinik;
        // Panggilan ke konstruktor Dokter(String, String)
        this.dokterUtama = new Dokter(nipDokter, namaDokter);
    }

    public void daftarPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokterUtama() {
        return dokterUtama;
    }

    public void cetakLayanan(Obat obat) {
        System.out.println("=== " + namaKlinik.toUpperCase() + " ===");
        System.out.println(dokterUtama.info());
        if (pasien != null) {
            System.out.println(pasien.info());
            dokterUtama.resepkanObat(pasien, obat);
        } else {
            System.out.println("Belum ada pasien yang terdaftar saat ini.");
        }
    }
}