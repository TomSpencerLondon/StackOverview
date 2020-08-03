package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StackShould {

  @Test
  void push_into_empty_stack() {
    // given
    Stack stack = new Stack();
    Object object = new Object();

    // when
    stack.push(object);

    // then
    assertThat(stack.pop()).isSameAs(object);
  }
}
