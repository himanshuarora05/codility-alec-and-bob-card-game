package com.docasap.allscripts.solutions;

import java.util.HashMap;
import java.util.Map;

public class AlecAndBobCardGame {

  private static Map<String, Integer> rankMap = new HashMap<>();

  static {
    rankMap.put("2", 2);
    rankMap.put("3", 3);
    rankMap.put("4", 4);
    rankMap.put("5", 5);
    rankMap.put("6", 6);
    rankMap.put("7", 7);
    rankMap.put("8", 8);
    rankMap.put("9", 9);
    rankMap.put("T", 10);
    rankMap.put("J", 11);
    rankMap.put("Q", 12);
    rankMap.put("K", 13);
    rankMap.put("A", 14);
  }

  public static void main(String[] args) {
    AlecAndBobCardGame solution1 = new AlecAndBobCardGame();
    int number = solution1.solution("23A84Q", "K2Q25J");
    System.out.println(number);
  }

  public int solution(String A, String B) {

    if(A.length()!= B.length()) {
      return -1;
    }

    int count =0;
    int rankA = -1;
    int rankB = -1;
    for(int i=0; i<A.length(); i++){
      char aCard = A.charAt(i);
      char bCard = B.charAt(i);

      rankA = getRank(aCard);
      rankB = getRank(bCard);

      if(rankA > rankB){
        count++;
      }
    }
    return count;
  }

  public int getRank(Character card){
    return rankMap.get(card.toString());
  }
}
