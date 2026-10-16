package P2.Tugas;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;

    public int hitungHargaBayar() {
        return lamaSewa * harga;
    }

    public void tampilData() {
        System.out.println("ID Transaksi : " + id);
        System.out.println("Nama Member  : " + namaMember);
        System.out.println("Nama Game    : " + namaGame);
        System.out.println("Harga Sewa   : Rp " + harga + " /hari");
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Bayar  : Rp " + hitungHargaBayar());
    }
}
