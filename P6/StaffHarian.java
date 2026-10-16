package P6;

public class StaffHarian extends Staff {   // anak dari Staff, otomatis mewarisi atribut Staff & Karyawan

    public int jmlJamKerja;   // atribut khusus staff harian

    public StaffHarian() { }  // constructor kosong, atribut diisi belakangan

    public StaffHarian(String nama, String alamat, String jk, int umur,
                       int gaji, int lembur, int potongan, int jmlJamKerja) {

        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        // panggil constructor Staff (wajib baris pertama), urutan di sini normal: lembur, potongan

        this.jmlJamKerja = jmlJamKerja;   // this = atribut, jmlJamKerja = parameter
    }

    public void tampilStaffHarian() {
        System.out.println("=====Data Staff Harian=====");

        super.tampilDataStaff();   // cetak data umum dari Staff, tidak perlu tulis ulang

        System.out.println("Jumlah Jam Kerja =" + jmlJamKerja);

        // gaji = upah per jam, jadi dikali jam kerja; tidak ada asuransi
        System.out.println("Gaji Bersih      =" + (gaji * jmlJamKerja + lembur - potongan));
    }
}