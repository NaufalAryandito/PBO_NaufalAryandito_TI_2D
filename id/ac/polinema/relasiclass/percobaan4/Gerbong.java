package id.ac.polinema.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        // Pertanyaan No 5: Pengecekan agar kursi tidak ditimpa jika sudah ada penumpang
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Gagal! Kursi nomor " + nomor + " sudah diduduki penumpang lain.");
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }

    public String info() {
        String info = "";
        info += "Kode Gerbong: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}