package com.lannstark.lec03;

public class Lec03Main {

  public static void main(String[] args) {
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

  private static String interpolation1() {
    Person person = new Person("김진규", 100);
    String log = String.format("사람의 이름은 %s이고, 나이는 %s살이다.", person.getName(), person.getAge());
    return log;
  }

  private static StringBuilder interpolation2() {
    Person person = new Person("김진규", 100);

    StringBuilder builder = new StringBuilder();
    builder.append("사람의 이름은 ");
    builder.append(person.getName());
    builder.append("이고, 나이는 ");
    builder.append(person.getAge());
    builder.append("세 입니다.");

    return builder;
  }


}
