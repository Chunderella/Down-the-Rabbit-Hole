package com.rabbit.oop.ex02;

class Calculator {
  
  int result = 0;
 
  void plus(int value) {
    this.result += value; 
  }

  void minus(int value) {
    
      this.result -= value; 
    }

   void multiple(int value) {
    
      this.result *= value; 
    }

    static void divide(int value) {
    
      this.result /= value; 
    }

    
    static int abs(int value) {
      return value >= 0 ? value : value * -1;
    }
  }
