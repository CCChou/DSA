package dennis.practice.datastructure.impl;

import java.util.Arrays;

import dennis.practice.datastructure.List;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 20;
    private int presentIndex;
    private Object[] elements;
    
    public ArrayList() {
        this(DEFAULT_SIZE);
    }
    
    public ArrayList(int size) {
        elements = new Object[size];
        presentIndex = -1;
    }
    
    @Override
    public boolean add(E element) {
        if(presentIndex == elements.length - 1) {
            elements = Arrays.copyOf(elements, size() + 20);
        }
        
        elements[++presentIndex] = element;
        
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if(presentIndex == elements.length - 1) {
            elements = Arrays.copyOf(elements, size() + 20);
        }
        
        for(int i=presentIndex; i>=index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        
        return true;
    }

    @Override
    public boolean contains(Object obj) {
        for(int i=0; i<=presentIndex; i++) {
            if(elements[i].equals(obj)) {
                return true;
            }
        }
        
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return isEmpty() ? null : (E) elements[index];
    }

    @Override
    public boolean isEmpty() {
        return presentIndex == -1;
    }

    @Override
    public boolean remove(int index) {
        if(isEmpty() || index > presentIndex) {
            return false;
        }
        
        for(int i=index; i<presentIndex; i++) {
            elements[i] = elements[i + 1];
        }
        elements[presentIndex--] = 0;
        
        return true;
    }

    @Override
    public int size() {
        return presentIndex + 1;
    }

}
