package P2.Tugas;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = "TRX-001";
        p.namaMember = "Rian";
        p.namaGame = "FIFA 24";
        p.harga = 25000;
        p.lamaSewa = 3;

        p.tampilData();
    }
}
