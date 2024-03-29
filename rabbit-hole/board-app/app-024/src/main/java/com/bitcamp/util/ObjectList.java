package com.bitcamp.util;

// List 규격에 따라 메서드를 구현할 것이라고 선언한다!
// 만약 규격에 따라 메서드를 구현하지 않으면 컴파일을 안 해준다.
// 
public class ObjectList extends AbstractList {

  private static final int DEFAULT_CAPACITY = 10;

  
  private Object[] elementData;

  public ObjectList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public ObjectList(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  @Override // 인터페이스 규격에 따라 메서드를 정의하는 것도 오버라이딩으로 간주한다.
  public void add(Object e) {
    if (size == elementData.length) {
      grow();
    }

    elementData[size++] = e;
  }

  @Override
  public Object[] toArray() {  //배열에서 꺼내서 배열에 담아서 리턴
    Object[] arr = new Object[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }
    return arr;
  }

  @Override
  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ListException("인덱스가 무효함!");
    }
    return elementData[index];
  }

  @Override
  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ListException("인덱스가 무효합니다!");
    }

    // 삭제한 객체를 리턴할 수 있도록 임시 변수에 담아 둔다.
    Object deleted = elementData[index];

    for (int i = index + 1; i < size; i++) {
      elementData[i - 1] = elementData[i];
    }
    elementData[--size] = null;

    return deleted;
  }

 

  private void grow() {
    int newCapacity = elementData.length + (elementData.length >> 1);
    Object[] newArray = new Object[newCapacity];
    for (int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
  }
}

//유일하게 동일한건 size 필드와 메서드
//






