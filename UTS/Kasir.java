package UTS;

public class Kasir {
    private String nama;

    public Kasir(String nama) { this.nama = nama; }

    public void cetakTagihan(Kamar k) {
        if (k == null) {
            System.out.println("Kamar tidak ditemukan.");
            return;
        }
        if (k.isKosong()) {
            System.out.println("Kamar " + k.getNomor() + " kosong, tidak ada tagihan.");
            return;
        }
        Pasien p = k.getPasien();
        Dokter d = p.getDpjp();
        System.out.println("=== Tagihan Kamar " + k.getNomor() + " ===");
        System.out.println("Pasien    : " + p.getNama() + " (" + p.getNoRM() + ") - " + p.getJenis());
        System.out.println("DPJP      : " + (d == null ? "-" : d.getNama() + " (" + d.getSpesialis() + ")"));
        System.out.println("Lama Inap : " + p.getLamaInap() + " malam");
        System.out.println("Total     : " + p.hitungBiaya(k.getTarifPerMalam()));
    }
}