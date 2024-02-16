public class AList {
    private Book[] array; // An array of size maxsize
    private int maxsize; // How many items the array can hold
    private int currentsize; // How many elements you have so far

    // An empty constructor: Should create an empty AList.
    // This implies having an array initialized to an initial
    // maxSize and setting size to 0.
    AList(int v) {
        maxsize = v; // Setting maxSize to the given value v
        currentsize = 0; // Setting currentSize to 0
        array = new Book[maxsize]; // Creating an array of Book objects with size maxsize
    }

    // void listAdd(Book pbook): Should add a new node with the given book to the AList and resize when
    // appropriate.
    // We can resize by updating maxsize and newArray.
    void listAdd(Book pbook) {
        if (currentsize == maxsize) {
            maxsize++; // Increase maxSize by 1
            Book[] newArray = new Book[maxsize]; // Create a new array with the updated maxSize
            // Transfer elements from the old array to the new array
            for (int i = 0; i < currentsize; i++) {
                newArray[i] = array[i];
            }
            array = newArray; // Update the reference to the new resized array
        }
        //Current size is the index where pbook needs to be placed
        array[currentsize] = pbook;
        //currentsize is incremented to prepare for next book
        currentsize++;
    }

    // Method to remove a book from the list
    void listRemove(int position) {
        // Case 3
        // This case handles the scenario where it
        // is invalid because it's equal to or greater than the current size
        if (position >= currentsize) {
            System.out.println("INVALID POSITION !!!!!!.");
            return;
        }
        // Case 1
        // If the element to be removed is last in the array
        if (position == currentsize - 1) {
            // Decrease size by 1
            currentsize--;
            return;
        }
        // Case 2: x < size - 1
        // Not last
        // Shift back all elements at index y, where y > x and y < size - 1
        for (int i = position; i < currentsize - 1; i++) {
            array[i] = array[i + 1];
        }
        // Decrease size by 1
        currentsize--;
    }

    // Method to represent the array as a string
    //https://www.geeksforgeeks.org/arrays-tostring-in-java-with-examples/
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < currentsize; i++) {
            result.append(array[i].toString()).append("\n");
        }
        return result.toString();
    }
}