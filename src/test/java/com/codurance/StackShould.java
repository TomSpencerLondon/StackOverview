package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackShould {

  private Stack stack;
  private Object object;

  @BeforeEach
  void setUp() {
    stack = new Stack();
    object = new Object();
  }

  @Test
  void push_into_empty_stack() {
    // when
    stack.push(object);

    // then
    assertThat(stack.pop()).isSameAs(object);
  }

  @Test
  void add_when_stack_is_not_empty() {
    // given
    stack.push(object);

    // when
    Object object2 = new Object();
    stack.push(object2);

    // then
    assertThat(stack.pop()).isSameAs(object2);
  }
}
