package P6;

public class Inheritance1 {
    public static void main(String[] args) {   // method pertama yang dijalankan Java

        // constructor berjalan berantai: Karyawan -> Staff -> StaffTetap
        // 250000, 200000 terbalik, tapi super(..., potongan, lembur) juga terbalik, jadi hasil tetap benar
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Lakilaki", 20,
                                       2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();   // Gaji Bersih = 1.850.000

        System.out.println();

        // 10000 = upah per jam, 100 = jam kerja
        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27,
                                         10000, 100000, 50000, 100);
        SH.tampilStaffHarian();  // Gaji Bersih = 1.050.000
    }
}