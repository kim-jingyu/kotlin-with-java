package com.lannstark.lec09;

public class JavaPerson {
  private final String name;
  private int age;

  public JavaPerson(String name, int age) {
    // 클래스가 생성되는 시점에 나이 검증 - 0보다 작거나 같으면 에러 던지기
    if (age <= 0) {
      throw new IllegalArgumentException(String.format("나이(%s)는 1 이상이어야 합니다.", age));
    }
    this.name = name;
    this.age = age;
  }

  // 최초로 태어나는 아기는 무조건 1살이다.
  public JavaPerson(String name) {
    this(name, 1);
  }

  // 3. custom getter, setter. 성인인지 확인
  public boolean isAdult() {
    return this.age >= 20;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

