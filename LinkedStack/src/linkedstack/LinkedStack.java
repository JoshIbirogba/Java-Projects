package linkedstack;
    
   public class LinkedStack<E> {

    class SinglyLinkedNode<E> {

        E data;
        SinglyLinkedNode <E> next;

        SinglyLinkedNode(E d) {
            data = d;
            next = null;
        }
    }

    SinglyLinkedNode <E> head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public E pop() {
        SinglyLinkedNode <E> temp = head;
        SinglyLinkedNode <E> previous = head;
        if (temp.next == null) {
            head = null;
            return temp.data;
        } else {
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = null;
            return temp.data;
        }
    }
    public void push(E item) {
        SinglyLinkedNode<E> newNode = new SinglyLinkedNode(item);
        if (this.isEmpty()) {
            newNode.next = head;
            head = newNode;
        } else 
        {
            SinglyLinkedNode <E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    @Override
    public String toString() {
        return "done";
    }
   }
