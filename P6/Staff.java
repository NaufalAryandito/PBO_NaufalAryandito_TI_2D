package P6;

public class Staff extends Karyawan {   // anak dari Karyawan, otomatis punya nama, alamat, jk, umur, gaji; juga induk bagi StaffTetap & StaffHarian (multilevel)

    public int lembur, potongan;   // atribut tambahan milik Staff
    public int x=20;
    public int x2 = super.x;   // akses atribut x milik Karyawan (superclass) dari Staff (subclass)
    public Staff() {}   // constructor kosong, otomatis memanggil super() milik Karyawan

    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);   // titip 5 data ke constructor Karyawan (wajib baris pertama, constructor tidak diwariskan)
        this.lembur = lembur;                  // this = atribut, lembur = parameter
        this.potongan = potongan;
    }

    public void tampilDataStaff() {
        super.tampilDataKaryawan();   // cetak Nama s/d Gaji dari Karyawan, tidak perlu tulis ulang
        System.out.println("Lembur        = " + lembur);
        System.out.println("Potongan      = " + potongan);
        System.out.println("Total Gaji    = " + (gaji + lembur - potongan));   // gaji diwariskan dari Karyawan (public)
    }
}