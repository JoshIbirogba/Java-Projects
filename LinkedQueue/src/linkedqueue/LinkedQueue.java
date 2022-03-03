
package linkedqueue;

public class LinkedQueue<E> {

    class SinglyLinkedNode<E> {

        E data;
        SinglyLinkedNode<E> next;

        SinglyLinkedNode(E d) {
            data = d;
            next = null;
        }
    }
    
    private int size = 0;
    SinglyLinkedNode<E> head = null;
    SinglyLinkedNode<E> tail = null;

    public LinkedQueue() {
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E item) {

        SinglyLinkedNode<E> newNode = new SinglyLinkedNode(item);

        if (size == 0) {
            tail = newNode;
            head = tail;
        }
        else{
             SinglyLinkedNode<E> temp = tail;
              tail = newNode;
              temp.next = newNode ;
        }
        size++;

    }

    public E remove() {
        SinglyLinkedNode<E> temp = head;
        if (head.next == tail.next) {
            head = null;
            tail= null; 
        } else {
            head = head.next;
        }
        size--;
        return temp.data;
    }
     
}

