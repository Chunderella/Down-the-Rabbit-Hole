package com.bitcamp.util;

public class ObjectList {

//<==================================================>//
private static final int DEFAULT_CAPACITY = 10;//(DEFAULT_CAPACITY의 최소값은 10이다.)
private int size;
private Object[] elementData;
//<==================================================>//
public ObjectList() {
elementData = new Object[DEFAULT_CAPACITY];
}
//<==================================================>//
public ObjectList(int initCapacity){
    elementData = new Object[initCapacity];
}
//<=====================add=============================>//
public void add(Object e){
if (size == elementData.length){
    grow();
}
elementData[size++] = e;
}
//<=====================toArray=============================>//
public Object[] toArray() {
    Object[] arr = new Object[size];
    for (int i = 0; i < arr.length; i++){
        arr[i] = elementData[i];
    }
    return arr;
        }
//<=====================get=============================>//
public Object get(int index) {
    if (index < 0 || index >= size) {
        return null;
    }
    return elementData[index];
}
//<=====================remove=============================>//
public boolean remove(int index) {
    if (index < 0 || index >= size) {
        return false;
    }
    for (int i = index + 1; i < size; i++) {
        elementData[i - 1] = elementData[i];
    }
    elementData[--size] = null;
    return true;
}
//<=====================size=============================>//
public int size() {
    return size;
}
//<=====================grow=============================>//
private void grow() {
    int newCapacity = elementData.length + (elementData.length >> 1);
    Object[] newArray = new Object[newCapacity];
    for (int i = 0; i < elementData.length; i++) {
        newArray[i] = elementData[i];
    }
    elementData = newArray;
}
}

