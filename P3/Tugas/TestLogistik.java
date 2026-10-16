package P3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nomor Resi: ");
        String resi = sc.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String pemilik = sc.nextLine();
        System.out.print("Masukkan Kapasitas Maksimal (kg): ");
        double kapasitas = sc.nextDouble();

        Kontainer kontainerAlfa = new Kontainer(resi, pemilik, kapasitas);

        System.out.println("\n--- Kontainer Berhasil Didaftarkan ---");
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        int pilihan = 0;
        do {
            System.out.println("\n=== MENU OPERASIONAL KARGO ===");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan (Bongkar Muat)");
            System.out.println("3. Cek Status Muatan Saat Ini");
            System.out.println("4. Selesai");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan baru (kg): ");
                    double masuk = sc.nextDouble();
                    kontainerAlfa.tambahMuatan(masuk);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;
                case 2:
                    System.out.print("Masukkan berat muatan yang dibongkar (kg): ");
                    double keluar = sc.nextDouble();
                    kontainerAlfa.turunkanMuatan(keluar);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;
                case 3:
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;
                case 4:
                    System.out.println("Operasional logistik selesai.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
