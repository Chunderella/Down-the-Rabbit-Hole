package com.rabbit.board;

public class BoardHandler {
  
  static int boardCount = 0;
  static final int SIZE = 3; 
//<=============App -> BoardHandler 1. 변수 생성==================>

    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    String[] content = new String[SIZE];
    String[] writer = new String[SIZE];
    String[] password = new String[SIZE];
    int[] viewCount = new int[SIZE];
    long[] createdDate = new long[SIZE];

//<=============App -> BoardHandler 2.ProcessBoardList================>    
  static void processBoardList() {
    java.text.SimpleDateFormat formatter = 
    new java.text.SimpleDateFormat("yyyy-MM-dd");

      System.out.println("[게시글 목록]");
      System.out.println("번호 제목 조회수 작성자 등록일");

    for (int i = 0; i < boardCount; i++) {
      java.util.Date date = new java.util.Date(createdDate[i]);
      String dateStr = formatter.format(date); 

      System.out.printf("%d\t%s\t%d\t%s\t%s\n",
        no[i], title[i], viewCount[i], writer[i], dateStr);
      }//for문 end
    }// processBoardList end ==>

//<=============App -> BoardHandler 3.ProcessBoardDetail================>  
  static void processBoardDetail() {
  System.out.println("[게시글 상세보기]");

  System.out.print("조회할 게시글 번호? ");
  String input = keyboardInput.nextLine();
  int boardNo = Integer.parseInt(input);


  int boardIndex = -1;
  for (int i = 0; i < boardCount; i++) {
  if (no[i] == boardNo) {
  boardIndex = i;
  break;
  }
  }
  if (boardIndex == -1) {
  System.out.println("해당 번호의 게시글이 없습니다!");
  return;
  }   

  System.out.printf("번호: %d\n", no[boardIndex]);
  System.out.printf("제목: %s\n", title[boardIndex]);
  System.out.printf("내용: %s\n", content[boardIndex]);
  System.out.printf("조회수: %d\n", viewCount[boardIndex]);
  System.out.printf("작성자: %s\n", writer[boardIndex]);
  java.util.Date date = new java.util.Date(createdDate[boardIndex]);
  System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date);
  }// processBoardDetail end ==> 
//<=============App -> BoardHandler 3.ProcessBoardDetail================>    
static void processBoardInput() {
  System.out.println("[게시글 등록]");

  if (boardCount == SIZE) {
  System.out.println("게시글을 더이상 저장할 수 없습니다.");
  return;
  }

  
      title[boardCount] = Prompt.intputString("제목? ");
      content[boardCount] = Prompt.intputString("내용? ");
      writer[boardCount] = Prompt.intputString("작성자? ");
      password[boardCount] = Prompt.intputString("암호? ");

      no[boardCount] = boardCount == 0 ? 1 : no[boardCount - 1] + 1;

      viewCount[boardCount] = 0;
      createdDate[boardCount] = System.currentTimeMillis();

      boardCount++;
  }// processBoardInput end ==> 기존 menu3
}