package Tugas;

public class LaptopGaming extends Laptop {
    private String tipeVga;
    private int refreshRateLayar; // satuan Hz

    public void setTipeVga(String tipeVga) {
        this.tipeVga = tipeVga;
    }

    public void setRefreshRateLayar(int hz) {
        this.refreshRateLayar = hz;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Laptop Gaming ===");
        super.printInfo();
        System.out.println("Kartu Grafis (VGA): " + tipeVga);
        System.out.println("Refresh Rate Layar: " + refreshRateLayar + " Hz");
    }
}