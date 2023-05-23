package com.lannstark.lec15;

import com.kimjingyu.lec15.ListWithJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {

  public static void main(String[] args) {
    mapTest();

    ListWithJava listWithJava = new ListWithJava();
    List<Integer> unmodifiableList = listWithJava.getUnmodifiableList();
    unmodifiableList.add(300);

    for (Integer integer : unmodifiableList) {
      System.out.println("integer = " + integer);
    }
  }

  private static void mapTest() {
    // JDK 8까지
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "MONDAY");
    map.put(2, "TUESDAY");

    // JDK 9부터
    Map.of(1, "MONDAY", 2, "TUESDAY");

    for (Integer key : map.keySet()) {
      System.out.println(key + " " + map.get(key));
    }

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

  private static void arrayTest() {
    int[] arr = {100, 200};

    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + " " + arr[i]);
    }
  }

}
