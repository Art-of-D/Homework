import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<E> implements Listable<E> {
    static {
        System.out.println("I`m ready to create LinkList! Give me something.");
    }
    int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    private static class Node<E> {
        Node<E> prev;
        Object middle;
        Node<E> next;


        Node(Node<E> prev, Object value, Node<E> next) {
            this.prev = prev;
            this.middle = value;
            this.next = next;

        }
    }

    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private void linkFirst(Object e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
    }

    void linkLast(Object e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }


    void linkBefore(Object e, Node<E> succ) {
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }


    private Object unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final Object element = f.middle;
        final Node<E> next = f.next;
        f.middle = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        return element;
    }


    private Object unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final Object element = l.middle;
        final Node<E> prev = l.prev;
        l.middle = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        return element;
    }


    Object unlink(Node<E> x) {
        // assert x != null;
        final Object element = x.middle;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.middle = null;
        size--;
        return element;
    }

    @Override
    public void add(Object value) {
        linkLast(value);
    }

    @Override
    public String get(int index) {
        return (String) node(index).middle;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if (Objects.equals(index, null)) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.middle == null) {
                    unlink(x);
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (Objects.equals(index, x.middle)) {
                    unlink(x);

                }
            }
            System.out.println("Removed");
        }
    }
        @Override
        public void clear () {
            for (Node<E> x = first; x != null; ) {
                Node<E> next = x.next;
                x.middle = null;
                x.next = null;
                x.prev = null;
                x = next;
            }
            first = last = null;
            size = 0;
            System.out.println("Cleared");
        }
    }


/*public E getFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.middle;
    }


    public E getLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.middle;
    }*/



   /* public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }


    public E removeLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }



    public void addFirst(E e) {
        linkFirst(e);
    }



    public void addLast(E e) {
        linkLast(e);
    }*/


    /*public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }*/

