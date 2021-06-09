package stack.arrayBased;

public interface ArrayStackInterface<Type> {

    void create(int arraySize);
    void push(Type data);
    void duplicate();
    void swap();
    void rotateRight();
    void rotateLeft();

    Type peek();
    Type pop();

    boolean isEmpty();
}
