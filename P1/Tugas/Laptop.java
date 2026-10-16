package Tugas;

public class Laptop {
    protected String merk;
    protected String prosesor;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public void printInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Prosesor: " + prosesor);
    }
}
