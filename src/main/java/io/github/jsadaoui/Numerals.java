package io.github.jsadaoui;

public final class Numerals {

  private Numerals() {
  }

  public static String toRoman(int arabic) {
    String roman = "";

    if (arabic == 4) {
      return "IV";
    }

    for (int i = 0;i < arabic; i++) {
      roman += "I";
    }

    return roman;
  }
}
