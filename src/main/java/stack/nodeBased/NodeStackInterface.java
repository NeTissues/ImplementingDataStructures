package stack.nodeBased;

import common.Node;

public interface NodeStackInterface<Type> {

    void push(Node<Type> data);
    void duplicate();
    void swap();
    void rotateRight();
    void rotateLeft();

    Type peek();
    Type pop();

    boolean isEmpty();
}
