public class Calculator {

    public static double calculateTotal(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            System.out.println("Warning: Price and quantity cannot be negative.");
            return 0;
        }
        double total = price * quantity;
        if (quantity >= 10) {
            total *= 0.90;
        }
        return total;
    }

    public static int countVowels(String input) {
        if (input == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void checkAccess(String role) {
        // Safe against null because literal "admin" is evaluated first
        if ("admin".equals(role)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    public static void main(String[] args) {
        // Task 3.1: Types and output
        String productName = "Wireless Mouse";
        int stockQuantity = 15;
        double unitPrice = 29.99;
        char currencySymbol = '$';
        boolean inStock = true;

        System.out.println("Product: " + productName + " | Price: " + currencySymbol + unitPrice 
            + " | Stock: " + stockQuantity + " | Available: " + inStock);

        // Task 3.2: Discount tests
        System.out.println("Total 1: " + calculateTotal(10.0, 5));   
        System.out.println("Total 2: " + calculateTotal(10.0, 10));  
        System.out.println("Total 3: " + calculateTotal(25.0, 2));   
        System.out.println("Total 4: " + calculateTotal(-5.0, 3));   

        // Task 3.3: Loops
        System.out.print("Divisible by 3 (1-20): ");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int num = 1;
        while (num <= 1000) {
            num *= 2;
        }
        System.out.println("First power of 2 exceeding 1000: " + num);
        System.out.println("Vowels in 'Backend Development': " + countVowels("Backend Development"));

        // Task 3.5: String comparison
        checkAccess(null);    
        checkAccess("admin"); 
    }
}
