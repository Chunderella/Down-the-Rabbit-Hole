package com.rabbit.lang.ex06;

public class Exam0602 {
  public static void main(String[] args) {
    int age = 17;




      if (age >= 19)

      System.out.println("성인이다."); //여기까지가 if문에 속함.
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");

      System.out.println("------------------------------");


    if (age >= 19) {
      System.out.println("성인이다.");
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");
    }
  }
}