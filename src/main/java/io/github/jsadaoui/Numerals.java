package io.github.jsadaoui;

public final class Numerals {

  private Numerals() {
  }

  public static String toRoman(int arabic) {
    String roman = "";

    for (int i = 0;i < arabic; i++) {
      roman += "I";
    }

    return roman;
  }
}
