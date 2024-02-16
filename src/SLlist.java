//https://www.udemy.com/course/data-structures-and-algorithms-java/learn/quiz/5811128#overview
class SLList {
 private SLNode head;
 private SLNode tail;
 private int length;

 // An empty constructor: Should create an empty SLList. This implies having a member data element
 // Head of type SLNode initialized to NULL
 public SLList() {
  this.head = null;
  this.tail = null;
  this.length = 0;
 }

 //ADDS TO END
 public void listAdd(Book p) {
  SLNode newNode = new SLNode(p);
  if (head == null) {
   head = newNode;
   tail = newNode;
  } else {
   tail.next = newNode;
   tail = newNode;
  }
  length++;
 }


 public SLNode get(int index){
  if(index < 0 || index >= length) return null;
  SLNode temp = head;
  for(int i = 0; i< index; i++){
   temp = temp.next;
  }
  return temp;
 }
 public SLNode removeLast() {
  if (length == 0) return null;
  SLNode temp = head;
  SLNode pre = head;
  while(temp.next != null) {
   pre = temp;
   temp = temp.next;
  }
  tail = pre;
  tail.next = null;
  length--;
  if (length == 0) {
   head = null;
   tail = null;
  }
  return temp;
 }

 public SLNode removeFirst() {
  if (length == 0) return null;
  SLNode temp = head;
  head = head.next;
  temp.next = null;
  length--;
  if (length == 0) {
   tail = null;
  }
  return temp;
 }
  // Method to remove a node at a given position
// Remove the node at the specified index in the list
  public void listRemove(int pos) {
   if (pos < 0 || pos >= length)
    return;
   if (pos == 0) {
    removeFirst();
    return;
   }
   if (pos == length - 1) {
    removeLast();
    return;
   }
   SLNode prev = get(pos - 1);
   if (prev == null)
    return;
   SLNode temp = prev.next;
   prev.next = temp.next;
   temp.next = null;
   length--;
  }


 //https://www.geeksforgeeks.org/arrays-tostring-in-java-with-examples/
 public String toString() {
  StringBuilder sb = new StringBuilder();
  SLNode current = head;
  while (current != null) {
   sb.append(current.data.toString()).append("\n");
   current = current.next;
  }
  return sb.toString();
 }
 }