package com.rabbit.lang.ex06;

public class Exam0604 {
  public static void main(String[] args) {
    
    int age = 17;

    if (age < 19) 
      System.out.println("미성년입니다.1");
      
    if (age >= 19) {
      System.out.println("성인입니다.2");
      } else
        System.out.println("미성년입니다.2");

        if (age >= 20) {
          System.out.println("-------------");
          System.out.println("성인입니다.3");
          } else {
            System.out.println("--------------");
            System.out.println("미성년입니다.3");
          }

          if (age >= 19) { 
            System.out.println("성인입니다.4");
            System.out.println("--------------------------");
          }
          else
            System.out.println("미성년입니다.4");
      

          if (age >= 19)
            System.out.println("성인입니다.5");
          else {
            System.out.println("미성년입니다.5");
            System.out.println("--------------------------");
          }
  }
}