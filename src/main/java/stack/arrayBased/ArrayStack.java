package stack.arrayBased;

import common.IOInterface;
//UNFINISHED
public class ArrayStack implements ArrayStackInterface<Double> {

    public Double[] stack;
    public int size;
    public Double head;
    public int cursor;

    public ArrayStack() {}

    @Override
    public void create(int size) {
        this.stack = new Double[size];
        this.size = size;
        this.head = null;
        this.cursor = -1;
        IOInterface.show("Created");
    }

    @Override
    public void push(Double data) {
        if (this.cursor == this.size - 1)
            IOInterface.show("Structure is full");
        else if (this.cursor == -1) {
            cursor++;
            stack[cursor] = data;
            this.head = data;
        }else {
            //data.setPrevious(this.stack[cursor]);//@Warning, when pushing the same node more than once, changes both instances' previous value
            cursor++;
            stack[cursor] = data;
            this.head = data;
        }
    }

    /*
    Duplicate: the top item is popped, and then pushed again (twice),
    so that an additional copy of the former top item is now on top, with the original below it.
     */
    @Override
    public void duplicate() {
        Double r = this.pop();
        push(r);
        push(r);
    }

    /*
    Swap or exchange: the two topmost items on the stack exchange places.
     */
    @Override
    public void swap() {
        Double top = this.pop(), second = this.pop();
        push(top);
        push(second);
    }

    /*
    Rotate (or Roll): the n topmost items are moved on the stack in a rotating fashion.
    For example, if n=3, items 1, 2, and 3 on the stack are moved to positions 2, 3, and 1 on the stack, respectively.
    Many variants of this operation are possible, with the most common being called left rotate and right rotate.
     */
    @Override
    public void rotateRight() {
        Double[] auxStack = new Double[size];
        for (int i=0;i<this.size-1;i++){
            auxStack[i] = this.pop();
        }
    }

    @Override
    public void rotateLeft() {

    }

    @Override
    public Double peek() {
        /*if (this.isEmpty())
            throw new IndexOutOfBoundsException();*/
        return this.stack[cursor];
    }

    @Override
    public Double pop() {
        if (cursor == -1){
            throw new IndexOutOfBoundsException("Structure is empty");
        }else {
            Double result = stack[cursor];
            this.stack[cursor] = null;
            cursor--;
            this.head = stack[cursor];
            return result;
        }
    }

    @Override
    public boolean isEmpty(){
        return cursor == -1 && this.head == null;
    }
}
