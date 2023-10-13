package io.github.jsadaoui;

public final class Numerals {

  private Numerals() {
  }

  public static String toRoman(int arabic) {
    if(arabic == 1) {
      return "I";
    }
    if(arabic == 2) {
      return "II";
    }
    return "";
  }
}