package Tugas;

 public class LaptopUltrabook extends Laptop {
    private double beratKg;
    private int dayaTahanBaterai; 

    public void setBeratKg(double beratKg) {
        this.beratKg = beratKg;
    }

    public void setDayaTahanBaterai(int jam) {
        this.dayaTahanBaterai = jam;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Laptop Ultrabook ===");
        super.printInfo();
        System.out.println("Berat: " + beratKg + " kg");
        System.out.println("Daya Tahan Baterai: " + dayaTahanBaterai + " Jam");
    }
} 