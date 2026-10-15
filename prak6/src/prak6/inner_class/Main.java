package prak6.inner_class;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESTAURANT ORDER SYSTEM ===");

        // Buat Restaurant
        Restaurant pizzaHut = new Restaurant("Pizza Hut", "Jl. Sudirman No.123", "021-555-1234");
        Restaurant KFC = new Restaurant("KFC", "Jl. Thamrin No.456", "021-555-5678");

        pizzaHut.displayRestaurantInfo();
        KFC.displayRestaurantInfo();

        Restaurant.Order order1 = pizzaHut.createOrder("Rina");

order1.addItem("Pizza", 2, 75000);
order1.addItem("Cola", 2, 15000);

order1.displayOrder();
order1.processOrder();

    }
}