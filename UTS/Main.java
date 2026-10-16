package UTS;

public class Main{
    public static void main(String[] args) {
        Bangsal melati = new Bangsal("Melati", 3, 400000);

        Dokter rina = new Dokter("dr. Rina", "Penyakit Dalam");
        Dokter andi = new Dokter("dr. Andi", "Paru");
        melati.setKepala(rina);

        Pasien budi = new PasienUmum("RM-001", "Budi", 3);
        budi.setDpjp(andi);
        melati.rawatInap(budi);            // kamar 1

        Pasien sari = new PasienBPJS("RM-002", "Sari", 4, "0001234");
        sari.setDpjp(rina);
        melati.rawatInap(sari, 3);         // kamar 3

        Kasir kasir = new Kasir("Kasir 1");
        kasir.cetakTagihan(melati.getKamar(1));
        kasir.cetakTagihan(melati.getKamar(3));
        kasir.cetakTagihan(melati.getKamar(2));
    }
}