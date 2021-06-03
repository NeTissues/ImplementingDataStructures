package staticList;

/**
 * @author NeTissues
 * @param <Type> Generics definition of data type
 */
public interface StaticInterface<Type> {

    void create(int arraySize);
    void destroy();
    void insert(int index, Type data);
    void insertFirst(Type data);
    void insertLast(Type data);
    void readList();

    boolean isEmpty();
    boolean isFull();
}
