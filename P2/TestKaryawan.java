package P2;

public class TestKaryawan {
    public static void main(String[] args) {
        Karyawan kry = new Karyawan();
        kry.id = "K001";
        kry.nama = "Ahmad";
        kry.jenisKelamin = "Laki-laki";
        kry.jabatan = "Staff IT";
        kry.gaji = 5000000;

        kry.tampilDataDiri();
        kry.lihatGaji();
    }
}
