package com.rabbit.lang.ex04;

public class Exam22 {
  public static void main(String[] args) {
    
    byte b = 100;
    short s = 100;
    int i = 98765678;
    long l = 98765678;
    char c = 100;

    float f;
    double d;

    // 정수 변수의 값을 부동소수점 변수에 저장할 때 값이 짤릴 수 있다.
    //
    f = b; // byte(1) ==> float(4). 값을 그대로 저장.
    System.out.println(f);

    f = s; // short(2) ==> float(4). 값을 그대로 저장. 
    System.out.println(f);

    f = c; // char(2) ==> float(4). 값을 그대로 저장.
    System.out.println(f);

    f = i; // int(4) ==> float(4). 
    // 유효자릿수를 넘는 정수는 짤린다.
    // 주의! 컴파일 오류가 발생하지 않는다.
    System.out.println(f);

    f = l; // long(8) ==> float(4)
    // 유효자릿수를 넘는 정수는 짤린다.
    // 주의! 컴파일 오류가 발생하지 않는다.
    System.out.println(f);

    d = i; // int(4) ==> double(8)
    // 유효자릿수 범위의 정수 값이므로 int(32비트) 값을 그대로 저장할 수 있다.
    System.out.println(d);       

    l = 18_2345_3456_4567_5678L;
    d = l; 
    // 유효 범위를 넘어가는 정수인 경우 짤린다.
    // 주의! 컴파일 오류가 발생하지 않는다.
    System.out.println(d);       
  }
}