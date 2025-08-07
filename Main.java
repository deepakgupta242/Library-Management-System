import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add User");
            System.out.println("2. Add Book");
            System.out.println("3. List Users");
            System.out.println("4. List Books");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    lib.addUser(new User(userId, userName));
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    lib.addBook(new Book(bookId, title, author));
                    break;
                case 3:
                    lib.listUsers();
                    break;
                case 4:
                    lib.listBooks();
                    break;
                case 5:
                    System.out.print("Enter book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter user ID to issue to: ");
                    int issueUserId = scanner.nextInt();
                    lib.issueBook(issueBookId, issueUserId);
                    break;
                case 6:
                    System.out.print("Enter book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    lib.returnBook(returnBookId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}