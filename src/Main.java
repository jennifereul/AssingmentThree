public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Teachings from the Worldly Philosophy", "Robert L. Heilbroner", 14.99);
        Book book2 = new Book("A Herstory of Economics", "Edith Kuiper", 24.99);
        Book book3 = new Book("Data and File Structures", "Zybooks", 80.00);
        Book book4 = new Book("Database Systems", "Zybooks", 80.00);

        // Using DLList
        DLList dlList = new DLList();
        dlList.listAdd(book1);
        dlList.listAdd(book2);
        dlList.listAdd(book3);
        dlList.listAdd(book4);

        System.out.println("Using DLList:");
        System.out.println("Here's your collection:");
        System.out.println(dlList);

        dlList.listRemove(1); // Removing book at index 1

        System.out.println("\nHere's your updated collection after removing a book:");
        System.out.println(dlList);

        // Using AList
        AList aList = new AList(4);
        aList.listAdd(book1);
        aList.listAdd(book2);
        aList.listAdd(book3);
        aList.listAdd(book4);

        System.out.println("\nUsing AList:");
        System.out.println("Here's your collection:");
        System.out.println(aList);

        aList.listRemove(1); // Removing book at index 1

        System.out.println("\nHere's your updated collection after removing a book:");
        System.out.println(aList);

        //Using SLList
        SLList slList = new SLList();
        slList.listAdd(book1);
        slList.listAdd(book2);
        slList.listAdd(book3);
        slList.listAdd(book4);

        System.out.println("\nUsing SLList:");
        System.out.println("Here's your collection:");
        System.out.println(slList);

        //REMOVES AT INDEX 1
        slList.listRemove(1);

        System.out.println("\nHere's your updated collection after removing a book:");
        System.out.println(slList);
    }
}

