package com.codurance;

public class Stack {
  Node head;

  public void push(Object object) {
    if (head == null){
      head = new Node(object, null);
    }else {
      Node temp = head;
      head = new Node(object, temp);
    }
  }

  public Object pop() {
    if (head == null) {
      throw new StackEmptyException();
    }
      Object result = head.data();
      head = head.next();
      return result;
  }
}
