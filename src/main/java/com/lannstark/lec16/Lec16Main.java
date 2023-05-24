package com.lannstark.lec16;

import com.kimjingyu.lec16.StringUtilsKt;

import java.util.List;

public class Lec16Main {

  public static void main(String[] args) {
    // 자바에서 코틀린 확장함수를 가져다가 사용하기
    System.out.println(StringUtilsKt.getLastChar("ABC"));

    Integer[] numbers = {1, 2, 3};
    List<Integer> numberList = List.of(1, 2, 3);

    Generic<Integer> generic = new Generic<>();
    generic.printAll(numbers);

    System.out.println();
    System.out.println("==================");

    generic.printAll(numbers);

    System.out.println();
    System.out.println("==================");

    generic.printList(numberList);

    System.out.println(generic.sum(numberList));


  }

}
