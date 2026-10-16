package Tugas;
public class TugasDemo {
    public static void main(String[] args) {
    
        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Cosmos");
        kipas.aturKecepatan(3);
        kipas.printInfo();
        System.out.println();


        Lampu lampu = new Lampu();
        lampu.setJenisLampu("LED");
        lampu.setDayaWatt(12);
        lampu.printInfo();
        System.out.println();

        
        LaptopGaming gaming = new LaptopGaming();
        gaming.setMerk("ASUS ROG Zephyrus");
        gaming.setProsesor("AMD Ryzen 9");
        gaming.setTipeVga("NVIDIA RTX 4070");
        gaming.setRefreshRateLayar(165);
        gaming.printInfo();
        System.out.println();

        LaptopUltrabook ultrabook = new LaptopUltrabook();
        ultrabook.setMerk("MacBook Air / Dell XPS");
        ultrabook.setProsesor("Apple M3 / Intel Core Ultra 7");
        ultrabook.setBeratKg(1.24);
        ultrabook.setDayaTahanBaterai(18);
        ultrabook.printInfo();
    }
}