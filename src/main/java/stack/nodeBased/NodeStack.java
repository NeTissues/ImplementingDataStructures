package stack.nodeBased;

import common.Node;

public class NodeStack<Type> implements NodeStackInterface<Type> {

    private Node<Type> head;
    private int size;

    public NodeStack() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void push(Node<Type> data) {
        this.head = new Node<>(this.head, data.getValue());
        this.size += 1;
    }

    /*
    Duplicate: the top item is popped, and then pushed again (twice),
    so that an additional copy of the former top item is now on top, with the original below it.
     */
    @Override
    public void duplicate() {
        Node<Type> r = new Node<>(this.head, this.head.getValue());
        this.pop();
        this.push(r);
        this.push(r);
    }

    @Override
    public void swap() {
        Node<Type> r1 = new Node<>(this.head, this.head.getValue());
        this.pop();
        Node<Type> r2 = new Node<>(this.head, this.head.getValue());
        this.push(r1);
        this.push(r2);
    }

    @Override
    public void rotateRight() {

    }

    @Override
    public void rotateLeft() {

    }

    @Override
    public Type peek() {
        if (this.head == null)
            throw new IndexOutOfBoundsException("Index out of bounds: Stack Underflow");
        return this.head.getValue();
    }

    @Override
    public Type pop() {
        if (this.head == null)
            throw new IndexOutOfBoundsException("Index out of bounds: Stack Underflow");
        Type result = this.head.getValue();
        this.head = this.head.getNext();
        this.size -= 1;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null && this.size == 0;
    }
}
