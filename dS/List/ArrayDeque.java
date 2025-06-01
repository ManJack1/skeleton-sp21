public class ArrayDeque<T> {

  public int[] sentinel_begin = new int[3];
  public int[] sentinel_end = new int[3];
  // private T item;
  private int count = 0;

  public ArrayDeque() {
    sentinel_begin[0] = sentinel_end;
    sentinel_begin[0] = sentinel_begin;
  }

  public class Node {

    public int[] p = new int[3];
    public int next;
    public int prev;
    public T item;

  }

  public void addFirst() {

    this.sentinel_begin[0] = new int[1][1][1]

  }

}
