package com.codurance;

public class Stack {
  Object object;

  public void push(Object object) {
    this.object = object;
  }

  public Object pop() {
    return object;
  }
}
