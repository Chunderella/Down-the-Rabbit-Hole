package com.rabbit.board;

public class App {

public static void main(String[] args) {
 //=====================step.06=======================================================
welcome();
loop: while (true){
  dispalyMenu();
  int menuNo = prompt.inputInt("메뉴를 선택하세요[1..3](0: 종료) ");
  displayLine();
//=====================step.06========switch + case No~===============================
switch (menuNo){
  case 0: break loop;
  case 1: BoardHandler.processBoardList(); break;
  case 2: BoardHandler.processBoardDetail(); break;
  case 3: BoardHandler.processBoardInput(); break;
  default: System.out.println("메뉴 번호가 옳지 않습니다!");
}
displayBlankLine();
} //while 끝

 System.out.println("안녕히 가세요!");
    keyboardInput.close();
  } //main 끝

   //<====================welcome setting===================>
static void welcome() {
    System.out.println("[게시판 애플리케이션]");
    System.out.println();
    System.out.println("환영합니다!");
    System.out.println();
} //<===welcome end===>
//<====================dispalyMenu setting===================>
static void dispalyMenu(){
  System.out.println("메뉴:");
  System.out.println("  1: 게시글 목록");
  System.out.println("  2: 게시글 상세보기");
  System.out.println("  3: 게시글 등록");
  System.out.print();
}
//<====================displayLine setting===================>
static void displayLine() {
  System.out.println("============================================");
}
//<====================displayBlankLine setting===================>
static void displayBlankLine() {
  System.out.println();
}
}
