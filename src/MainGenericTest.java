public class MainGenericTest {

        public static void main(String[] args) {
            // Creating some Book objects
            Book book1 = new Book("Teachings from the Worldly Philosophy", "Robert L. Heilbroner", 14.99);
            Book book2 = new Book("A Herstory of Economics", "Edith Kuiper", 24.99);
            Book book3 = new Book("Data and File Structures", "Zybooks", 80.00);
            Book book4 = new Book("Database Systems", "Zybooks", 80.00);

            //UNCOMMENT AS NEEDED
            GenericAList<Book> booksList = new GenericAList<>();
            //GenericDLList<Book> booksList = new GenericDLList<>();
            //GenericSLList<Book> booksList = new GenericSLList<>();

            booksList.listAdd(book1);
            booksList.listAdd(book2);
            booksList.listAdd(book3);
            booksList.listAdd(book4);

            System.out.println("Here's your updated collection after removing a book:");
            System.out.println(booksList);


            booksList.listRemove(1);

            System.out.println("\nHere's your updated collection after removing a book:");
            System.out.println(booksList);
        }
    }



