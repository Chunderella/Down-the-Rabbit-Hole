package com.rabbit.lang.ex04;

public class Exam26 {
  public static void main(String[] args) {
   
    byte b = Byte.valueOf("100");
    short s = Short.valueOf("32767");
    int i1 = Integer.valueOf("2122223333"); // 문자열 ==> int
    int i2 = Integer.parseInt("2122223333"); // 문자열 ==> int
    long l = Long.valueOf("9221111222233334444"); 
    float f1 = Float.valueOf("3.14f");
    float f2 = Float.parseFloat("3.14f");
    double d = Double.valueOf("9876.54321");
    boolean bool1 = Boolean.valueOf("TRUE");   // 문자열 ==> boolean
    boolean bool2 = Boolean.parseBoolean("TRUE");   // 문자열 ==> boolean
    char c = "가나다".charAt(1); // = > 나 0번 1번 2번에서 1번 문자만 추출하라!

    System.out.println(b);
    System.out.println(s);
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(l);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(d);
    System.out.println(bool1);
    System.out.println(bool2);
    System.out.println(c);
  }
}
