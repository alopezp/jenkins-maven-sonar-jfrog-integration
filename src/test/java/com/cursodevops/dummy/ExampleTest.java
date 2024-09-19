package com.cursodevops.dummy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleTests {

  @Autowired
  private Example example;

  @Test
  void testTestMethod() {
    String result = example.test();
    assertThat(result).isEqualTo("Hello World!");
  }
}
