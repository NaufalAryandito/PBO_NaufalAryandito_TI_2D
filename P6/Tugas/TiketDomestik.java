package P6.Tugas;

public class TiketDomestik extends TiketPesawat {
    protected int pajakBandara;

    public TiketDomestik() {}

    public TiketDomestik(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public int hitungTotalBayar() {
        return hargaDasar + hitungBiayaBagasi() + pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();
        System.out.println("Pajak Bandara  = " + pajakBandara);
        System.out.println("Total Bayar    = " + hitungTotalBayar());
    }
}
