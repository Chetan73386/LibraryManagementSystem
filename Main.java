public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "B001"));
        library.addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "B002"));
        library.addBook(new Book("1984", "George Orwell", "B003"));

        
        library.addUser(new User("Chetan", 101));
        library.addUser(new User("Shirisha", 102));

        
        library.showBooks();

        
        library.issueBook("B002", 101);

        
        library.showBooks();

        
        library.returnBook("B002");

        
        library.showBooks();
    }
}

