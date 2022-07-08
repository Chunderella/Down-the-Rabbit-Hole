package com.rabbithole.board;

public class App {

public static void main(String[] args) {
    
    System.out.println("[게시판 애플리케이션]");
    System.out.println();
    System.out.println("안녕하세요!");
    System.out.println();

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    while (true) {
        System.out.println();
        System.out.println("메뉴:");
        System.out.println("    1: 게시글 목록");
        System.out.println("    2:게시글 상세보기");
        System.out.println();
        System.out.println("메뉴를 선택하세요[1..2](0: 종료) ");
        
        int menuNo = keyboardInput.nextInt();
        keyboardInput.nextLine();

        if (menuNo == 0) {
            break;
        }   else if (menuNo == 1) {
            //0번을 입력할 경우 종료, 1번을 입력할 경우 아래의 내용을 출력
            System.out.println("[게시글 목록");
            System.out.println("번호 제목 조회수 작성자 등록일");
            //1번 텍스트
            System.out.print("1");
            System.out.print("\t");
            System.out.print("만관부에요!");
            System.out.print("\t");
            System.out.print(20 + "\t");
            System.out.print("김오찌\t"); 
            System.out.print("2022-07-08\r\n");
            //2번 텍스트
            System.out.print(2 + "\t" + "밥주세요!\t" + 11 + "\t" + "김네로\t" + "2022-07-08\n");
            //3번 텍스트
            System.out.println(3 + "\t" + "깻잎을 다오!\t" + 31 + "\t" + "김영심\t2022-07-08");
            //4번 텍스트
            System.out.printf("%d\t%s\t%d\t%s\t%s\n", 4, "아직 좀 낯설어", 45, "김설탱", "2020-07-08");

        } else if (menuNo == 2) {
            System.out.println("게시판 상세보기");
            System.out.printf("번호:%\n", 1);
            System.out.printf("제목:%\s", "안녕하세요.");
            System.out.printf("내용:%\s", "저는 만관부에요.");
            System.out.printf("조회수:%\n", 999);
            System.out.printf("작성자:%\s", "김오찌");
            System.out.printf("등록일:%\n", "2002-07-08");

        } else {
            System.out.println("메뉴 번호가 옳지 않습니다!");
        } //else 끝
    }//while 끝
            System.out.println("안녕히 가세요!");
            keyboardInput.close();
    }
}   

        








