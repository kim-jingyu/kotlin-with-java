package com.lannstark.lec02;

import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  /**
   * 플랫폼 타입: 코틀린이 null 관련 정보를 알 수 없는 타입
   * Runtime 시 Exception이 날 수 있다.
   */
  public String getName() {
    return name;
  }

}


