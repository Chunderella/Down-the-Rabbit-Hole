package com.rabbit.oop.ex03;


public class Exam0140 {

  static class Testresult {
    
    String name;
    int kor;
    int math;
    int sum;
    float average;
    
  }

  public static void main(String[] args) {

    Testresult a1 = new Testresult();
    Testresult a2 = new Testresult();
    Testresult a3 = new Testresult();

    a1.name = "가나다";
    a1.kor = 90;
    a1.math = 80;
    a1.sum = a1.kor + a1.math;
    a1.average = a1.sum / 2f;
  
    a2.name = "라마사";
    a2.kor = 80;
    a2.math = 70;
    a2.sum = a2.kor + a2.math;
    a2.average = a2.sum / 2f;

    a3.name = "바차카";
    a3.kor = 95;
    a3.math = 87;
    a3.sum = a3.kor + a3.math;
    a3.average = a3.sum / 2f;
  
  
    

  
  
  
  
  }
}


