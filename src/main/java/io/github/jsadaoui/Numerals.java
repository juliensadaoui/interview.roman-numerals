package io.github.jsadaoui;

public final class Numerals {

  private Numerals() {
  }

  public static String toRoman(int arabic) {
    StringBuilder roman = new StringBuilder();

    if (arabic >= 10) {
      roman.append("X");
      arabic -= 10;
    }

    if (arabic == 9) {
      return "IX";
    }

    if (arabic == 4) {
      return "IV";
    }

    if (arabic >= 5) {
      roman.append("V");
      arabic -= 5;
    }

    for (int i = 0;i < arabic; i++) {
      roman.append("I");
    }

    return roman.toString();
  }
}
