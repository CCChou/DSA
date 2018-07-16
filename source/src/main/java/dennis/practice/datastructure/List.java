package dennis.practice.datastructure;

public interface List<E> {
    boolean add(E element);
    boolean add(int index, E element);
    boolean contains(Object o);
    E get(int index);
    boolean isEmpty();
    boolean remove(int index);
    int size();
}
