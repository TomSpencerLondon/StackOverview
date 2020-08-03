package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

  @Test
  void pop_next_object_from_stack_when_pop_more_than_once() {
    // given
    stack.push(object);
    Object object2 = new Object();
    stack.push(object2);

    // when
    Object result1 = stack.pop();
    Object result2 = stack.pop();

    // then
    assertThat(result1).isSameAs(object2);
    assertThat(result2).isSameAs(object);
  }

  @Test
  void stack_should_throw_exception_if_popped_when_empty() {
    assertThatThrownBy(() -> stack.pop()).isInstanceOf(StackEmptyException.class);
  }
}
