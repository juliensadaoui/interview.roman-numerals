package io.github.jsadaoui;

public final class Numerals {

  private Numerals() {
  }

  public static String toRoman(int arabic) {
    String roman = "";

    if (arabic == 9) {
      return "IX";
    }

    if (arabic == 4) {
      return "IV";
    }

    if (arabic >= 5) {
      roman += "V";
      arabic -= 5;
    }

    for (int i = 0;i < arabic; i++) {
      roman += "I";
    }

    return roman;
  }
}
