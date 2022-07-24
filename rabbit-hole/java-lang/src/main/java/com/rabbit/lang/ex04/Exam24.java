package com.rabbit.lang.ex04;

public class Exam24 {
  public static void main(String[] args) {
    
    float f = 3.14f;
    int i = (int)f;  // 소수점 이하가 제거된다.
    System.out.println(i);

    // double ==> long
    double d = 9876.56789;
    long l = (long)d; // 소수점 이하가 제거된다.
    System.out.println(l);
  }
}
  