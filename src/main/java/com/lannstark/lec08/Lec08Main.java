package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  // 1. 함수 선언 문법 - 두 정수를 받아서 더 큰 정수를 반환
  private int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  // 2. 주어진 문자열을 N번 출력 - 오버로딩
  public void repeat(String str, int num, boolean useNewLine) {
    for (int i = 1; i <= num; i++) {
      if (useNewLine) {
        System.out.println(str);
      } else {
        System.out.print(str);
      }
    }
  }

  public void repeat(String str, int num) {
    repeat(str, num, true);
  }

  public void repeat(String str) {
    repeat(str, 3);
  }

  // 4. 같은 타입의 여러 파라미터 받기 (가변인자) - 문자열을 N개 받아 출력
  public void printAll(String... strings) {
    for (String string : strings) {
      System.out.println(string);
    }
  }

}
