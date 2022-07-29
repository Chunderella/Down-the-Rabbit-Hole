package com.rabbit.board;


//<========step 1.============>
public class App {

    
    static int boardCount = 0; // 저장된 게시글의 개수
    final int SIZE = 3;

  static int[] no = new int[SIZE];
  static String[] title = new String[SIZE];
  static String[] content = new String[SIZE];
  static String[] writer = new String[SIZE];
  static String[] password = new String[SIZE];
  static int[] viewCount = new int[SIZE];
  static long[] createdDate = new long[SIZE];

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in); 

    public static void main(String[] args) {
        welcome();
        loop: while (true) {
            displayMenu();
            int menuNo = prompMenu();
            displayMenu();
        }

        switch (menuNo) {
            case 0: break loop;
            case 1: processBoardList();
            case 2: processBoardDetail();
            case 3: processBoardInput();
            default: System.out.println("메뉴 번호가 옳지 않습니다!");          
       }
          displayBlankLine();
    } // while


            System.out.println("안녕히 가세요!");
    keyboardInput.close();
  }


     System.out.println("게시판 애플리케이션");   
     System.out.println();   
     System.out.println("환영합니다.");
     System.out.println();
//<========step 3.============>
    
//<========step 4,5 + 배열=======>

//<========step 5 날짜 정보 추가=======>
   java.text.SimpleDateFormat formatter = 
      new java.text.SimpleDateFormat("yyyy-MM-dd"); 

//<========step 5 배열의 크기=======>
   

    //<========step 5 배열 생성 ======>
 

//<========step 3.====while(반복문)========>
//<========step 4.====메뉴 추가========>
    while (true) {
     System.out.println("메뉴:");
      System.out.println("  1: 게시글 목록");
      System.out.println("  2: 게시글 상세보기");
      System.out.println("  3: 게시글 등록");
      System.out.println();
      System.out.print("메뉴를 선택하세요[1..3](0: 종료) ");
    
    int menuNo = keyboardInput.nextInt();
      keyboardInput.nextLine(); 

//<========step 5 구분선 추가 ======>
System.out.println("--------------------------------------");

//<========step 3. ====BoardListApp==if + else if======>
      if (menuNo == 0) {
        break;
        
      } else if (menuNo == 1) {
        System.out.println("[게시글 목록]");
        System.out.println("번호 제목 조회수 작성자 등록일");

        for (int i = 0; i < boardCount; i++) {
          // 밀리초 데이터 ==> Date 도구함으로 날짜 정보를 설정
          java.util.Date date = new java.util.Date(createdDate[i]);
          
          // 날짜 정보 ==> "yyyy-MM-dd" 형식의 문자열
          String dateStr = formatter.format(date); 

          System.out.printf("%d\t%s\t%d\t%s\t%s\n",
            no[i], title[i], viewCount[i], writer[i], dateStr);
        }

        System.out.print(1);
        System.out.print("\t");
        System.out.print("제목입니다1");
        System.out.print('\t');
        System.out.print(20 + "\t");
        System.out.print("홍길동\t");
        System.out.print("2022-07-08\r\n");

        System.out.print(2 + "\t" + "제목입니다2\t" +
            11 + "\t" + "홍길동\t" + "2022-07-08\n");

        System.out.println(3 + "\t제목입니다3\t" +
            31 + "\t" + "임꺽정\t2022-07-08");

        System.out.printf("%d\t%s\t%d\t%s\t%s\n",
            4, "제목입니다4", 45, "유관순", "2022-07-08");

      //<========step 3. ====BoardDetailApp========>
      } else if (menuNo == 2) {
        System.out.println("[게시판 상세보기]");

  //<========step 5. 게시글 번호 검색========>
        System.out.print("조회할 게시글 번호? ");
        String input = keyboardInput.nextLine();
        int boardNo = Integer.parseInt(input);

        // 해당 번호의 게시글이 몇 번 배열에 들어 있는지 알아내기
        int boardIndex = -1;
        for (int i = 0; i < boardCount; i++) {
          if (no[i] == boardNo) {
            boardIndex = i;
            break;
          }
        }

        // 사용자가 입력한 번호에 해당하는 게시글을 못 찾았다면
        if (boardIndex == -1) {
          System.out.println("해당 번호의 게시글이 없습니다!");
          continue;
        }

        System.out.printf("번호: %d\n", no[boardIndex]);
        System.out.printf("제목: %s\n", title[boardIndex]);
        System.out.printf("내용: %s\n", content[boardIndex]);
        System.out.printf("조회수: %d\n", viewCount[boardIndex]);
        System.out.printf("작성자: %s\n", writer[boardIndex]);
        java.util.Date date = new java.util.Date(createdDate[boardIndex]);
        System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date);
//<========step 4. ====메뉴3 else if========>

if (boardCount == SIZE) {
          System.out.println("게시글을 더이상 저장할 수 없습니다.");
          continue;
        }

        System.out.print("제목? ");
        title[boardCount] = keyboardInput.nextLine();

        System.out.print("내용? ");
        content[boardCount] = keyboardInput.nextLine();

        System.out.print("작성자? "); 
        writer[boardCount] = keyboardInput.nextLine();

        System.out.print("암호? ");
        password[boardCount] = keyboardInput.nextLine();

        no[boardCount] = boardCount == 0 ? 1 : no[boardCount - 1] + 1;

        viewCount[boardCount] = 0;
        createdDate[boardCount] = System.currentTimeMillis();
        
        boardCount++;

      } else {
        System.out.println("메뉴 번호가 옳지 않습니다!");
      }
      
      System.out.println(); // 메뉴를 처리한 후 빈 줄 출력
    } // while


}
