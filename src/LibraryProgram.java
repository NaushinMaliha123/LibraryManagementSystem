import java.util.Scanner;

public class LibraryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(100);
        System.out.println("Library Management System");
        System.out.println("1. Add a book");
        System.out.println("2. Remove a book");
        System.out.println("3. Search for a book");
        System.out.println("4. Display all books");
        System.out.println("5. Exit");

        while(true){
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.println("Enter book author: ");
                String author = scanner.nextLine();
                library.addBook(title, author);
            }
            else if(choice == 2){
                System.out.print("Enter book title to remove: ");
                String removeTitle = scanner.nextLine();
                library.removeBook(removeTitle);
            }
            else if(choice == 3){
                System.out.print("Enter book title to search: ");
                String searchTitle = scanner.nextLine();
                library.searchBook(searchTitle);
            }
            else if(choice == 4){
                library.displayAllBooks();
            }
            else if(choice == 5){
                System.out.println("Exiting the system.");
                return;
            }
            else{
                System.out.println("Invalid choice, please try again.");
                return;
            }
        }
    }
}