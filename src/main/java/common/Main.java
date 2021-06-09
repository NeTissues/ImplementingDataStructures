package common;

import stack.arrayBased.ArrayStack;
import stack.nodeBased.NodeStack;
import staticList.StaticList;

public class Main {
    public static void main(String[] args) {
        StaticList staticList = new StaticList();
        ArrayStack arrayStack = new ArrayStack();
        NodeStack<Double> nodeStack = new NodeStack<>();

        Node<Double> testingNode = new Node<>(null, 2.0);
        Node<Double> testingNode2 = new Node<>(null, 3.0);

        IOInterface.show("===========================================");
        IOInterface.show("---------------------------------");
        IOInterface.show("\tStatic List Implementation");staticList.create(10);
        IOInterface.show("---------------------------------");
        IOInterface.show("- insertFirst(1.0)");staticList.insertFirst(1.0);
        IOInterface.show("- insert(1, 1.0)");staticList.insert(1, 1.0);
        IOInterface.show("- insertLast(2.0)");staticList.insertLast(2.0);
        IOInterface.show("- removeFromRange(1, 2)");staticList.removeFromRange(1, 2);
        IOInterface.show("- update(0, 2.0)");staticList.update(0, 2.0);
        IOInterface.show("- readList()");staticList.readList();
        IOInterface.show("- size(): " + staticList.size());
        IOInterface.show("- destroy()");staticList.destroy();
        IOInterface.show("- create(1) again");staticList.create(1);
        IOInterface.show("- isEmpty() = " + staticList.isEmpty());
        IOInterface.show("- insertLast(3.0)");staticList.insertLast(3.0);
        IOInterface.show("- isFull() = " + staticList.isFull());
        IOInterface.show("- get(0) = " + staticList.get(0));
        IOInterface.show("- remove(0) = " + staticList.remove(0));
        IOInterface.show("---------------------------------");
        IOInterface.show("- readList()");staticList.readList();
        IOInterface.show("---------------------------------");

        IOInterface.show("===========================================");

        IOInterface.show("---------------------------------");
        IOInterface.show("\tArray Stack Implementation");arrayStack.create(10);
        IOInterface.show("---------------------------------");
        IOInterface.show("- push(2.0)");arrayStack.push(2.0);
        IOInterface.show("- push(3.0)");arrayStack.push(3.0);
        IOInterface.show("- push(5.0)");arrayStack.push(5.0);
        IOInterface.show("- peek() = " + arrayStack.peek());
        IOInterface.show("- pop() = " + arrayStack.pop());
        IOInterface.show("- peek() = " + arrayStack.peek());
        IOInterface.show("- duplicate()");arrayStack.duplicate();
        IOInterface.show("- pop() = " + arrayStack.pop());
        IOInterface.show("- pop() = " + arrayStack.pop());
        IOInterface.show("- peek() = " + arrayStack.peek());
        //IOInterface.show("- rotateRight()");arrayStack.rotateRight();
        IOInterface.show("---------------------------------");

        IOInterface.show("===========================================");

        IOInterface.show("---------------------------------");
        IOInterface.show("\tNode Stack Implementation");
        IOInterface.show("---------------------------------");
        IOInterface.show("- push(2.0)");nodeStack.push(testingNode);
        IOInterface.show("- push(3.0)");nodeStack.push(testingNode2);
        IOInterface.show("- peek() = " + nodeStack.peek());
        IOInterface.show("- pop() = " + nodeStack.pop());
        IOInterface.show("- duplicate()");nodeStack.duplicate();
        //IOInterface.show("- pop() = " + nodeStack.pop());
        //IOInterface.show("- pop() = " + nodeStack.pop());
        IOInterface.show("- swap()"); nodeStack.swap();
        IOInterface.show("- push(3.0)");nodeStack.push(testingNode2);
        IOInterface.show("- rotateRight()");nodeStack.rotateRight();
        IOInterface.show("- rotateLeft()");nodeStack.rotateLeft();
        IOInterface.show("---------------------------------");

    }
}
