package common;

import staticList.StaticList;

public class Main {
    public static void main(String args[]) {
        StaticList staticList = new StaticList();

        IOInterface.show("===========================================");
        IOInterface.show("---------------------------------");
        IOInterface.show("\tStatic List Implementation");staticList.create(10);
        IOInterface.show("---------------------------------");
        IOInterface.show("- insertFirst(1.0)");staticList.insertFirst(1.0);
        IOInterface.show("- insert(1, 1.0)");staticList.insert(1, 1.0);
        IOInterface.show("- insertLast(3.0)");staticList.insertLast(2.0);
        IOInterface.show("- readList()");staticList.readList();
        IOInterface.show("- destroy()");staticList.destroy();
        IOInterface.show("- create(1) again");staticList.create(1);
        IOInterface.show("- isEmpty() = " + staticList.isEmpty());
        IOInterface.show("- insertLast(3.0)");staticList.insertLast(3.0);
        IOInterface.show("- isFull() = " + staticList.isFull());
        IOInterface.show("---------------------------------");
        IOInterface.show("- readList()");staticList.readList();
        IOInterface.show("---------------------------------");

        IOInterface.show("===========================================");


    }
}