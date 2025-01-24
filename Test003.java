import java.util.Scanner;

class GroceryItem {
    int itemNo;
    String itemName;
    int quantity;
    double price;

    GroceryItem(int itemNo, String itemName, int quantity, double price) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalPrice() {
        return quantity * price;
    }

    void displayItem() {
        System.out.println("Item No: " + itemNo);
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: " + price);
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("---------------------------");
    }
}

public class Test003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for first item:");
        System.out.print("Item No: ");
        int itemNo1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Item Name: ");
        String itemName1 = scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity1 = scanner.nextInt();
        System.out.print("Price per unit: ");
        double price1 = scanner.nextDouble();

        System.out.println("Enter details for second item:");
        System.out.print("Item No: ");
        int itemNo2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Item Name: ");
        String itemName2 = scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity2 = scanner.nextInt();
        System.out.print("Price per unit: ");
        double price2 = scanner.nextDouble();

        GroceryItem item1 = new GroceryItem(itemNo1, itemName1, quantity1, price1);
        GroceryItem item2 = new GroceryItem(itemNo2, itemName2, quantity2, price2);

        System.out.println("\nGrocery Items Details:");
        item1.displayItem();
        item2.displayItem();

        double totalBill = item1.getTotalPrice() + item2.getTotalPrice();
        System.out.println("Total Bill Amount: " + totalBill);

        scanner.close();
    }
}
