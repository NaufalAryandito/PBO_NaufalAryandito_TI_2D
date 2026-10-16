package id.ac.polinema.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Instansiasi Klinik (Otomatis membuat Dokter via COMPOSITION)
        Klinik klinikSehat = new Klinik("Klinik Medika Utama", "D001", "dr. Andi");

        // 2. Instansiasi Pasien di luar (Untuk AGGREGATION)
        Pasien pasien1 = new Pasien("RM-99", "Budi Santoso");
        klinikSehat.daftarPasien(pasien1);

        // 3. Instansiasi Obat di luar (Untuk DEPENDENCY)
        Obat paracetamol = new Obat("Paracetamol", "500mg 3x1");

        // 4. Jalankan alur
        klinikSehat.cetakLayanan(paracetamol);
    }
}