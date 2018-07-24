package dennis.practice.datastructure.impl;

import dennis.practice.datastructure.List;

public class LinkedList<E> implements List<E> {
    private Node<E> head;
    private int size;
    
    public LinkedList() {
        head = new Node<>();
        size = 0;
    }
    
    @Override
    public boolean add(E element) {
        Node<E> node = new Node<>();
        node.element = element;
        
        Node<E> current =head;
        while(current.next != null) {
            current = current.next;
        }
        
        current.next = node;
        
        size++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if(index > size) {
            return false;
        }
        
        Node<E> node = new Node<>();
        node.element = element;
        
        Node<E> current = head;
        Node<E> prev = current;
        int count = -1;
        while(current != null && count != index) {
            prev = current;
            current = current.next;
            count++;
        }
        
        prev.next = node;
        node.next = current;
        
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> node = head.next;
        while(node != null) {
            if(node.element.equals(o)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public E get(int index) {
        Node<E> node = head;
        int count = -1;
        while(node != null && count != index) {
            node = node.next;
            count++;
        }
        
        return node.element;
    }

    @Override
    public boolean isEmpty() {
        return head.next == null;
    }

    @Override
    public boolean remove(int index) {
        if(isEmpty() || index > size) {
            return false;
        }
        
        Node<E> node = head;
        Node<E> prev = node;
        int count = -1;
        while(node != null && count != index) {
            prev = node;
            node = node.next;
            count++;
        }
        
        prev.next = node.next;
        node = null;
        
        return true;
    }

    @Override
    public int size() {
        return size;
    }
    
    class Node<T> {
        private T element;
        private Node<T> next;
        
        public Node() {}
        public Node(T element) {
            this.element = element;
        }
    }
}
