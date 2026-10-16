package id.ac.polinema.relasiclass.percobaan5;

public class Mobil {
    private String merek;
    private Mesin mesin;

    public Mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin(); // Composition: Objek Mesin diinstansiasi di dalam Mobil
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}