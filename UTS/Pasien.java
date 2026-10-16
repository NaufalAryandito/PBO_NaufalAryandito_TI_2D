package UTS;

public class Pasien {
    private String noRM;
    private String nama;
    private int lamaInap;
    private Dokter dpjp;

    public Pasien(String noRM, String nama, int lamaInap) {
        this.noRM = noRM;
        this.nama = nama;
        this.lamaInap = lamaInap;
    }

    public int hitungBiaya(int tarifPerMalam) {
        return tarifPerMalam * lamaInap;
    }
    
    public int hitungBiaya(int tarifPerMalam, int diskonPersen) {
        return hitungBiaya(tarifPerMalam) * (100 - diskonPersen) / 100;
    }

    public String getJenis() { return "Pasien"; }
    public String getNoRM() { return noRM; }
    public String getNama() { return nama; }
    public int getLamaInap() { return lamaInap; }
    public Dokter getDpjp() { return dpjp; }
    public void setDpjp(Dokter d) { this.dpjp = d; }
}