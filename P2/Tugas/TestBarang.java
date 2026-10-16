package P2.Tugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang b = new Barang();
        b.kode = "BRG01";
        b.namaBarang = "Keyboard Mechanical";
        b.hargaDasar = 300000;
        b.diskon = 10;

        b.tampilData();
    }
}