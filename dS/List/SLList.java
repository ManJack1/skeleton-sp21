import javax.swing.text.Segment;

public class SLList<Pineapple> {

  public class IntNode {

    public Pineapple item;
    public IntNode next;
    public IntNode prev;

    public IntNode(Pineapple i, IntNode n) {
      this.item = i;
      this.next = n;
      this.prev = p;
    }

  }

  private IntNode first;
  // 防止first = null
  private IntNode sentinel;
  private int count = 1;

  public SLList(Pineapple x) {
    sentinel = new IntNode(null, null);
    sentinel.next = new IntNode(x, null);
    count = 1;
  }

  // creat a empty SLList
  public SLList() {
    sentinel = new IntNode(null, null);
    count = 0;
  }

  public void addFirst(Pineapple x) {
    sentinel.next = new IntNode(x, sentinel.next);
    count = count + 1;
  }

  public Pineapple getFirst() {
    return sentinel.next.item;
  }

  // NOTE:若初始列表为0，则这个程序会错误
  public void addLast(Pineapple x) {
    count += 1;
    IntNode p = sentinel;
    while (p.next != null) {
      p = p.next;
    }
    p.next = new IntNode(x, null);
  }

  public int size() {
    return size(sentinel.next);
  }

  public int size(IntNode p) {
    if (p.next == null) {
      return 1;
    }
    return 1 + size(p.next);
  }

  public int countSize() {
    return count;
  }

}
