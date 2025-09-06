
import java.util.Scanner;

 class ProductMain {

    // Method to calculate total amount spent on all products
    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept 5 products from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter Product " + (i + 1) + " details:");
            System.out.print("Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        Product maxPriceProduct = products[0];
        for (Product p : products) {
            if (p.price > maxPriceProduct.price) {
                maxPriceProduct = p;
            }
        }

        System.out.println("\nProduct with highest price has PID: " + maxPriceProduct.pid);

        // Calculate total amount spent
        double totalAmount = calculateTotal(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}