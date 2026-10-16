
public class Procedural {
    public static void main(String[] args) {
        String itemName1 = "Coffee";
        Float itemPrice1 = 120000f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        Float itemPrice2 = 30000.0f;
        int quantity2 = 1;

        System.out.println(itemName1 + ": " + total(itemPrice1, quantity1));
        System.out.println(itemName2 + ": " + total(itemPrice2, quantity2));
    }

    public static float total(Float price, int quantity) {
        return price * quantity;
    }
}