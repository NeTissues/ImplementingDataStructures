package common;

public class Node<Type> {

    private Node<Type> next;
    private Type value;

    public Node(Node<Type> next, Type value) {
        this.next = next;
        this.value = value;
    }

    public Node<Type> getNext() {
        return next;
    }

    public void setNext(Node<Type> next) {
        this.next = next;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}
