package io.github.jsadaoui;

import org.junit.jupiter.api.Test;

import static io.github.jsadaoui.Numerals.toRoman;
import static org.assertj.core.api.Assertions.assertThat;

class NumeralsTest {

  @Test
  void shouldConvertZeroToEmptyString() {
    assertThat(toRoman(0)).isEmpty();
  }

  @Test
  void shouldConvertOneToI() {
    assertThat(toRoman(1)).isEqualTo("I");
  }

  @Test
  void shouldConvertTwoToII() {
    assertThat(toRoman(2)).isEqualTo("II");
  }

  @Test
  void shouldConvertThreeToIII() {
    assertThat(toRoman(3)).isEqualTo("III");
  }

  @Test
  void shouldConvertFourToIV() {
    assertThat(toRoman(4)).isEqualTo("IV");
  }

  @Test
  void shouldConvertFiveToV() {
    assertThat(toRoman(5)).isEqualTo("V");
  }

  @Test
  void shouldConvertSixToVI() {
    assertThat(toRoman(6)).isEqualTo("VI");
  }

  @Test
  void shouldConvertSevenToVII() {
    assertThat(toRoman(7)).isEqualTo("VII");
  }

  @Test
  void shouldConvertSevenToVIII() {
    assertThat(toRoman(8)).isEqualTo("VIII");
  }

  @Test
  void shouldConvertNineToIX() {
    assertThat(toRoman(9)).isEqualTo("IX");
  }

  @Test
  void shouldConvertTenToX() {
    assertThat(toRoman(10)).isEqualTo("X");
  }

}
