package P6;
public class StaffTetap extends Staff {   // mewarisi Staff (dan Karyawan di atasnya)

    public String golongan;   // atribut milik StaffTetap: golongan, contoh "2A"
    public int asuransi;      // atribut milik StaffTetap: jumlah asuransi

    public StaffTetap() { }   // constructor kosong: objek dibuat tanpa data awal

    // constructor berparameter: 7 data untuk class induk + 2 data untuk class ini
    public StaffTetap(String nama, String alamat, String jk, int umur,
                      int gaji, int lembur, int potongan,
                      String golongan, int asuransi) {

        // panggil constructor Staff (wajib baris pertama, constructor tidak diwariskan)
        // urutan potongan, lembur terbalik, sesuai jobsheet
        super(nama, alamat, jk, umur, gaji, potongan, lembur);

        this.golongan = golongan;   // this = atribut class ini, golongan = parameter
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap() {
        System.out.println("=====Data Staff Tetap=====");   // judul

        super.tampilDataStaff();    // cetak data umum dari Staff (Nama s/d Total Gaji)

        System.out.println("Golongan        =" + golongan);    // atribut khusus
        System.out.println("Jumlah Asuransi =" + asuransi);
        System.out.println("Tampil x: "+ (super.x+super.x));   // akses atribut x milik Karyawan (superclass) dari StaffTetap (subclass)

        // gaji, lembur, potongan langsung dipakai karena diwariskan (public)
        System.out.println("Gaji Bersih     =" + (gaji + lembur - potongan - asuransi));
    }
}

