package staticList;

/**
 * @author NeTissues
 * @param <Type> Generics definition of data type
 */
public interface StaticInterface<Type> {

    void create(int arraySize);
    void destroy();
    void update(int index, Type data);
    void insert(int index, Type data);
    void insertFirst(Type data);
    void insertLast(Type data);
    void readList();

    Type[] removeFromRange(int start, int end);
    Type remove(int index);
    Type get(int index);

    boolean isEmpty();
    boolean isFull();

    int size();
}
