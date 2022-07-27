package com.bitcamp.board.dao;

import com.bitcamp.board.domain.Board;
import com.bitcamp.util.ObjectList;

public class BoardList extends ObjectList {
//ObjectList를 상속한다.

private int boardNo = 0;
//===============add====================
@Override
  public void add(Object e) {
    Board board = (Board) e;
    board.no = nextNo();
    super.add(e);
  }
  //===============get================
  public Board get(int boardNo) {
    for (int i = 0; i < size(); i++){
      Board board = (Board) super.get(i);
      if (board.no == boardNo) {
        return board; 
      }
    }
    return null
  }
//===============remove================
@Override
  public boolean remove(int boardNo) {
    for (int i = 0; i < size; i++) {
      Board board = (Board) super.get(i);
      if (board.no == boardNo) {
       return super.remove(i);
      }
    }
    return false;
  }

  private int nextNo() {
    return ++boardNo;
  }
}














