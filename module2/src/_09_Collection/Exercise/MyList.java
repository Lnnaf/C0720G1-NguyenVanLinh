package _09_Collection.Exercise;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    Object elements[];

    protected MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    protected MyList(int capacity) {
        if (capacity >= 0){
            elements = new Object[capacity];
        }else{
            throw new IllegalArgumentException("capacity: "+ capacity);
        }
    }
    protected int size (){
        return this.size;
    }
    protected void  clear (){
        size = 0;
        for (int i  = 0; i< elements.length; i++){
            elements[i]=null;
        }
    }
    protected boolean add(E element){
        if(elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }
    protected void add(E element, int index){
        if(index >elements.length){
            throw new IllegalArgumentException("index: "+index);
        }else if(elements.length == size){
            this.ensureCapacity(5);
        }if (elements[index]==null){
            elements[index]=element;
            size++;
        }else {
            for(int i=size+1; i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
    protected void ensureCapacity (int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elements.length+ minCapacity;
            elements = Arrays.copyOf(elements, newSize );
        }else{
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }
    protected E get (int index){
        return (E) elements[index];
    }
    protected int indexOf(E element){
        int index = -1;
        for (int i =0; i < size; i++){
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    protected boolean contains(E element){
        return this.indexOf(element) >=0;
    }
    protected MyList<E> clone (){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }
    protected E remove (int index){
        if(index <0 || index >elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for(int i = 0 ; i<size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
