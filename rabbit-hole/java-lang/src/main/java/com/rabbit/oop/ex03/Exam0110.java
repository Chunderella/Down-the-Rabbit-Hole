package com.rabbit.oop.ex03;
public class Exam0110 {


  static class A {
    
    int v1; 
    boolean v2;
  }

  public static void main(String[] args) {

   
    A obj1 = new A(); 
    A obj2 = new A();
    A obj3 = new A();

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.printf("%d, %d, %d\n", obj1.v1, obj2.v1, obj3.v1);
  }
}
