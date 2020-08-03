package com.codurance;

public class Node {
  private final Object data;
  private final Node next;

  public Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }

  public boolean hasNext() {
    return this.next != null;
  }

  public Object data() {
    return data;
  }

  public Node next() {
    return next;
  }
}
