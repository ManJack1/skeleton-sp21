package deque;

public class LinkedListDeque<T> {
  private class IntNode {
    private T item;
    public IntNode next;
    public IntNode prev;

    public IntNode(T i, IntNode p, IntNode n) {
      this.item = i;
      this.prev = p;
      this.next = n;
    }
  }

  private IntNode sentinel_begin;
  private IntNode sentinel_end;
    private int count = 0;

  public LinkedListDeque() {
    sentinel_begin = new IntNode(null, null, null);
    sentinel_end = new IntNode(null, null, null);
    sentinel_begin.next = sentinel_end;
    sentinel_end.prev = sentinel_begin;
    count = 0;

  }

  public LinkedListDeque(T x) {
    sentinel_begin = new IntNode(null, null, null);
    sentinel_end = new IntNode(null, null, null);
    IntNode p = new IntNode(x, sentinel_begin, sentinel_end);
    sentinel_begin.next = p;
    sentinel_end.prev = p;
    count = 1;
  }

  public void addFirst(T item) {
    IntNode p = new IntNode(item, sentinel_begin, sentinel_begin.next);
    sentinel_begin.next.prev = p;
    sentinel_begin.next = p;
    count++;
  }

  public void addLast(T item) {
    IntNode p = new IntNode(item, sentinel_end.prev, sentinel_end);
    sentinel_end.prev.next = p;
    sentinel_end.prev = p;
    count++;
  }

  public boolean isEmpty() {
    if (count == 0) {
      return true;
    }
    return false;
  }

  public int size() {
    return count;
  }

  public void printDeque() {
    IntNode p = this.sentinel_begin;
    while (p!= sentinel_end) {
      System.out.print(p.next.item + " ");
      p = p.next;
    }
    System.out.println();

  }

  public T removeFirst() {
    IntNode p = this.sentinel_begin.next;
    if (p.item == null) {
      return null;
    }
    this.sentinel_begin.next = p.next;
    this.sentinel_begin.next.prev = p.prev;
    count--;
    return sentinel_begin.next.item;
  }

  public T removeLast() {
    IntNode p = this.sentinel_end.prev;
    if (p.item == null) {
      return null;
    }
    this.sentinel_end.prev = p.prev;
    this.sentinel_end.prev.next = p.next;
    count--;
    return sentinel_end.prev.item;
  }

  public T get(int index) {
    IntNode p = this.sentinel_begin.next;
    if (index == 0) {
      return p.item;
    }
    while (index  != 0) {
      index = index - 1;
      p = p.next;
      if (p == null) {
        return null;
      }
    }
    return p.item;
  }


}
