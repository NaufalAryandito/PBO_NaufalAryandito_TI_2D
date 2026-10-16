package Tugas;

public class KipasAngin {
    private String merk;
    private int kecepatan; // 0: Mati, 1, 2, 3

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void aturKecepatan(int level) {
        this.kecepatan = level;
    }

    public void printInfo() {
        System.out.println("=== Kipas Angin ===");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Level: " + kecepatan);
    }
}