package dennis.practice.datastructure.impl;

import dennis.practice.datastructure.List;

public class LinkedList<E> implements List<E> {
    private LinkedList<E> root;
    private E element;
    private int size;
    
    public LinkedList() {
        size = 0;
    }
    
    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean add(int index, E element) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

}
