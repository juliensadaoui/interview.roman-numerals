package io.github.jsadaoui;

public final class Numerals {

  private Numerals() {
  }

  public static String toRoman(int arabic) {
    String roman = "";

    if (arabic == 4) {
      return "IV";
    }

    if (arabic == 5) {
      return "V";
    }

    for (int i = 0;i < arabic; i++) {
      roman += "I";
    }

    return roman;
  }
}
