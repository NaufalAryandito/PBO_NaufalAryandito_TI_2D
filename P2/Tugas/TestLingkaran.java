package P2.Tugas;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.phi = 3.14;
        l.r = 10;

        System.out.println("Jari-jari Lingkaran : " + l.r);
        System.out.println("Luas Lingkaran      : " + l.hitungLuas());
        System.out.println("Keliling Lingkaran  : " + l.hitungKeliling());
    }
}
