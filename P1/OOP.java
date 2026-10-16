class Product {
    private final String itemName;
    private final Float itemPrice;
    static int totbrg;

    public Product (String itemName, Float itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        totbrg++;
    }
    public float total (int quantity) {
        return itemPrice * quantity;
    }
    public static void totalBarang() {
        System.out.println("Total Barang: " + totbrg);
    }
    public String getName() {
        return itemName;
    }
}

public class OOP {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 120000f);
        Product product2 = new Product("Sugar", 30000.0f);
        Product product3 = new Product("Beras", 80000.0f);

        System.out.println(product1.getName() + ": " + product1.total(3));
        System.out.println(product2.getName() + ": " + product2.total(1));
        System.out.println(product3.getName() + ": " + product3.total(2));
        Product.totalBarang();
    }
}