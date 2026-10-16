package P6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        // Objek 1: Tiket Kereta (mengisi atribut manual)
        System.out.println("===== Tiket Kereta ============");
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.hargaDasar = 350000;
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";
        tk.tampilKereta();

        // Objek 2: Tiket Domestik
        System.out.println("\n======== Tiket Pesawat Domestik ========");
        TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        td.tampilDomestik();

        // Objek 3: Tiket Internasional
        System.out.println("\n====== Tiket Pesawat Internasional ====");
        TiketInternasional ti = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        ti.tampilInternasional();
    }
}
