//https://www.udemy.com/course/data-structures-and-algorithms-java/learn/quiz/5811128#overview
public class DLList {
    private DLNode head;
    private DLNode tail;
    private int length;

    public DLList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void listAdd(Book p) {
        DLNode newNode = new DLNode(p);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public DLNode get(int index) {
        if (index < 0 || index >= length) return null;
        DLNode temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public DLNode removeLast() {
        if (length == 0) return null;
        DLNode temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public DLNode removeFirst() {
        if (length == 0) return null;
        DLNode temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void listRemove(int position) {
        if (position < 0 || position >= length) return;

        if (position == 0) {
            removeFirst();
            return;
        }

        if (position == length - 1) {
            removeLast();
            return;
        }

        DLNode temp = get(position);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
    }
    //https://www.geeksforgeeks.org/arrays-tostring-in-java-with-examples/
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}
