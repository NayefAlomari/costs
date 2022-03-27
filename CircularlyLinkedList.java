package Lab6;
import java.util.Scanner;





public class CircularlyLinkedList<E> {
    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }
    public E last() {
        if (isEmpty())return null;
        return tail.getElement();
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            tail = new Node<E>(element, null);
            tail.setNext(tail);
        }else {
            Node<E> newest = new Node<E>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E element) {
        addFirst(element);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();
        E deleted = head.getElement();
        if (head == tail)
            tail=null;
        else
            tail.setNext(head.getNext());
        size--;
        return deleted;
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element,Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}