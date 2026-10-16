package Tugas;

public class Lampu {
    private String jenisLampu;
    private int dayaWatt;

    public void setJenisLampu(String jenisLampu) {
        this.jenisLampu = jenisLampu;
    }

    public void setDayaWatt(int watt) {
        this.dayaWatt = watt;
    }

    public void printInfo() {
        System.out.println("=== Lampu ===");
        System.out.println("Jenis Lampu: " + jenisLampu);
        System.out.println("Daya: " + dayaWatt + " Watt");
    }
}
