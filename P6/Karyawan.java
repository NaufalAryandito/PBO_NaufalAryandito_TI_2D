package P6;

public class Karyawan {   // superclass paling atas, tidak pakai extends

    public String nama, alamat, jk;   // data umum semua karyawan
    public int umur, gaji;            // public supaya diwariskan & bisa dipakai langsung di subclass (private tidak bisa)
    public int x = 10;
    public Karyawan() {}   // constructor kosong, atribut diisi belakangan; juga dipanggil otomatis oleh subclass yang constructor-nya kosong

    public Karyawan(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;       // this.nama = atribut, nama = parameter (tanpa this, atribut tidak terisi)
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }   // constructor ini jalan PERTAMA saat objek subclass dibuat: Karyawan -> Staff -> StaffTetap

    public void tampilDataKaryawan() {   // dipanggil subclass lewat super.tampilDataKaryawan(), jadi tidak perlu tulis ulang
        System.out.println("Nama          = " + nama);
        System.out.println("Alamat        = " + alamat);
        System.out.println("Jenis Kelamin = " + jk);
        System.out.println("Umur          = " + umur);
        System.out.println("Gaji          = " + gaji);
    }
}