package com.rabbit.lang.ex06;

public class Exam0606 {
  public static void main(String[] args) {
    int age = 15;
    

    if (age >= 19)
      if (age >= 70) 
        System.out.println("지하철 무임승차 가능합니다");
       else 
          System.out.println("미성년입니다.");
        
  
    
      System.out.println("----------");
    

      if (age >= 19) {
        if (age >= 70)
         System.out.println("지하철 무임승차 가능합니다.");
      }
        else {
          System.out.println("미성년입니다.");
        }
          System.out.println("----------");

          if (age >= 19) {
            if (age >= 70) 
              System.out.println("지하철 무임승차 가능합니다.");
          }
          else 
            System.out.println("미성년입니다.");
    }
}
