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




}
