import java.util.*;
abstract class FoodOrder {
    abstract void showMenu();
    abstract void printBill(int qty);
}
class Swiggy extends FoodOrder {
    int price;
    String item;
    Swiggy(String item, int price) {
        this.item = item;
        this.price = price;
    }
    @Override
    void showMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Burger - Rs.120");
        System.out.println("2. Chicken Biryani - Rs.250");
        System.out.println("3. Veg Biryani - Rs.169");
        System.out.println("4. Pizza - Rs.299");
        System.out.println("5. French Fries - Rs.99");
        System.out.println("6. Sandwich - Rs.149");
        System.out.println("7. Fried Rice - Rs.199");
        System.out.println("8. Noodles - Rs.179");
        System.out.println("9. Chicken 65 - Rs.220");
        System.out.println("10. Soft Drink - Rs.50");
        System.out.println("0. Exit");
    }
    @Override
    void printBill(int qty) {
        System.out.println("You Ordered " + qty + " " + item);
        System.out.println("Bill Amount = Rs." + (price * qty));
    }
}
public class SwiggyFoodOrder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int totalBill = 0;
        while (true) {
            Swiggy menu = new Swiggy("", 0);
            menu.showMenu();
            System.out.print("Enter Item Number (0 to Exit): ");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("\n===== FINAL BILL =====");
                System.out.println("Total Amount = Rs." + totalBill);
                System.out.println("Thank You for Using Swiggy!");
                break;
            }
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            Swiggy order = null;
            switch (choice) {
                case 1: order = new Swiggy("Burger", 120); break;
                case 2: order = new Swiggy("Chicken Biryani", 250); break;
                case 3: order = new Swiggy("Veg Biryani", 169); break;
                case 4: order = new Swiggy("Pizza", 299); break;
                case 5: order = new Swiggy("French Fries", 99); break;
                case 6: order = new Swiggy("Sandwich", 149); break;
                case 7: order = new Swiggy("Fried Rice", 199); break;
                case 8: order = new Swiggy("Noodles", 179); break;
                case 9: order = new Swiggy("Chicken 65", 220); break;
                case 10: order = new Swiggy("Soft Drink", 50); break;
                default:
                    System.out.println("Invalid Choice!");
            }
            if (order != null) {
                order.printBill(qty);
				totalBill += order.price * qty;
            }
        }
        sc.close();
    }
}