// Generic version of SLList
class GenericSLList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int length;

    GenericSLList() {
        head = null;
        tail = null;
        length = 0;
    }

    void listAdd(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    void listRemove(int pos) {
        if (pos < 0 || pos >= length) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            length--;
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next == null) {
            tail = current;
        }
        length--;
    }

    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}