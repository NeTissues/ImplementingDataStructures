package common;

/**
 * @author NeTissues
 * @param <Type> Generics definition of data type
 */
public interface LinkedListInterface<Type> {
    public int size();
    public boolean isEmpty();

    public void show();
    public void removeFirst();

    public void append();

    public void insertAfterIndex(int index, Type newItem);
    public void insertAfterItem(Type previousItem, Type newItem);

    public boolean delete(Type deleted);
    public Type search(Type item);
    public boolean replaceBy(Type oldItem, Type newItem);
}
