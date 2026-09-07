import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, backend!");

        // Task 4.2 - Working with Objects
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert C. Martin", 464));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 352));
        books.add(new Book("Refactoring", "Martin Fowler", 448));
        books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 96));

        System.out.println("\n--- Book List ---");
        int countOver300 = 0;
        for (Book b : books) {
            System.out.println(b.describe());
            if (b.getPages() > 300) {
                countOver300++;
            }
        }
        System.out.println("Books with >300 pages: " + countOver300);

        // Task 4.3 - A Map
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Clean Code", 5);
        stock.put("The Pragmatic Programmer", 3);
        stock.put("Refactoring", 8);
        stock.put("The Little Prince", 12);

        System.out.println("\n--- Inventory Stock ---");
        System.out.println("Copies of 'Clean Code': " + stock.get("Clean Code"));

        int totalCopies = 0;
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            totalCopies += entry.getValue();
        }
        System.out.println("Total inventory count: " + totalCopies);
    }
}