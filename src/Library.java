public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity){
        books = new Book[capacity];
        bookCount =0;
    }

    public void addBook(String title, String author){
        if(bookCount >= books.length){
            System.out.println("Cannot add more books in library.");
            return;
        }
        Book newBook = new Book(title, author);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].equals(newBook)) {
                System.out.println("The book is already available in the library.");
                return;
            }
        }

        books[bookCount++] = newBook;
        System.out.println("Book added successfully.");
    }

    public void removeBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i] = books[--bookCount];
                books[bookCount] = null;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("The book is not available in the library.");
    }

    public void searchBook(String searchTitle){
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No books found matching the title.");
        }
    }

    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

}