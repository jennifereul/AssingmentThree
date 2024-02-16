public class DLNode {
    public Book data;
    public DLNode prev;
    public DLNode next;

    public DLNode(Book data) {
        this.data = data;
        this.next = null;
    }
}
