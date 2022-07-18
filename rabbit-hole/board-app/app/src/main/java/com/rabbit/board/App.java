/*
 * 게시판 관리 애플리케이션
 * 비트캠프-20220704
 */
package com.rabbit.board; //패키지명

public class App { //클래스명 : App
  
  public static void main(String[] args) { //메인 메서드 

    welcome(); //welcome의 내용을 불러온다. (31줄) static void welcome()
    loop: while (true) {
      displayMenu();  //displayMenu()의 내용을 불러온다. (39줄) static void displayMenu()
      int menuNo = Prompt.inputInt("메뉴를 선택하세요[1..3](0: 종료) ");
      displayLine();

      switch (menuNo) {
        case 0: break loop;
        case 1: BoardHandler.processList(); break;
        case 2: BoardHandler.processDetail(); break;
        case 3: BoardHandler.processInput(); break;
        default: System.out.println("메뉴 번호가 옳지 않습니다!");
      }

      displayBlankLine();
    } // while

    System.out.println("안녕히 가세요!");
    Prompt.close();
  } // main

  static void welcome() {
    System.out.println("[게시판 애플리케이션]");
    System.out.println();
    System.out.println("환영합니다!");
    System.out.println();
  }

  static void displayMenu() {
    System.out.println("메뉴:");
    System.out.println("  1: 게시글 목록");
    System.out.println("  2: 게시글 상세보기");
    System.out.println("  3: 게시글 등록");
    System.out.println();
  }

  static void displayLine() {
    System.out.println("=========================================");
  }

  static void displayBlankLine() {
    System.out.println(); // 메뉴를 처리한 후 빈 줄 출력
  }
}
