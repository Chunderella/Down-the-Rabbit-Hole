package com.rabbit.lang.ex04;

public class Exam15 {
  public static void main(String[] args) {
    
    byte b;  // 1바이트 크기의 메모리
    short s; // 2바이트 크기의 메모리 
    int i;   // 4바이트 크기의 메모리 
    long l;  // 8바이트 크기의 메모리
    
    //- 부동소수
    float f;   // 4바이트 크기의 메모리
    double d;  // 8바이트 크기의 메모리
    
    //- 문자코드
    char c;  // 2바이트 크기의 메모리  (0부터 양수)
    
    //- 논리
    boolean bool;  // 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 않다. 다만 JVM 명세서에는 int 로 다룬다고 나와있다.
    
    //레퍼런스 변수
    String str; // 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 않다. 메모리 주소를 저장할 만큼 큰 크기
    Date date;  // 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 않다. 메모리 주소를 저장할 만큼 큰 크기
  }
}
