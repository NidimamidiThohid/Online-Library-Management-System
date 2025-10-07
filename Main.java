import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Available Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.showAvailableBooks();
                case 3 -> library.issueBook();
                case 4 -> library.returnBook();
                case 5 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
