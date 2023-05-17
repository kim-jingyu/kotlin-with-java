package com.lannstark.lec07;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
    JavaFilePrinter javaFilePrinter = new JavaFilePrinter();

    javaFilePrinter.readFile();
  }

  // 주어진 문자열을 정수로 변경
  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아니다.", str));
    }
  }

  // 주어진 문자열을 정수로 변경 - 실패하면 null 반환
  private Integer parseIntOrNull(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
