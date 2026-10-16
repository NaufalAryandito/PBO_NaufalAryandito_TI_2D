package id.ac.polinema.relasiclass.percobaan1;
public class Laptop {
    private String merk;
    private processor proc;

    public Laptop() {
    }

    public Laptop(String merk, processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(processor proc) {
        this.proc = proc;
    }

    public processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
