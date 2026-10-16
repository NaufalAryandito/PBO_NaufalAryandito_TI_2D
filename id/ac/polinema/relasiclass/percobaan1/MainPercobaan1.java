package id.ac.polinema.relasiclass.percobaan1;

public class MainPercobaan1 { 
    public static void main(String[] args) {
        processor p = new processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();

        processor p1 = new processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop l1 = new Laptop();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();

        Laptop l2 = new Laptop("Thinkpad", new processor("Intel i5", 3));
        l2.info();
    }
}
