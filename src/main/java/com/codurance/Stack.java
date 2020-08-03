package com.codurance;

import java.util.List;

public class Stack {
  Object object;

  public void push(Object object) {
    this.object = object;
  }

  public Object pop() {
    return object;
  }
}
