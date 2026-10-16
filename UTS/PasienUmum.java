package UTS;

public class PasienUmum extends Pasien {
    private static final int BIAYA_ADMIN = 150000;

    public PasienUmum(String noRM, String nama, int lamaInap) {
        super(noRM, nama, lamaInap);
    }

    @Override
    public int hitungBiaya(int tarifPerMalam) {
        return super.hitungBiaya(tarifPerMalam) + BIAYA_ADMIN;
    }

    @Override
    public String getJenis() { return "Umum"; }
}