public class DDList {
  private IntNode sentinel;
  private IntNode last;
  private int count;

  public class IntNode {

    public int item;
    public IntNode next;
    public IntNode prev;

    public IntNode(int i, IntNode n, IntNode p) {
      this.item = i;
      this.next = n;
      this.prev = p;
    }

  }

  public void addLast(int x) {
    last.next = new IntNode(x, null);
    last = last.next;
    count += 1;
  }

  public DDList(int x) {
    sentinel = new IntNode(0, null);
    sentinel.next = new IntNode(x, null, sentinel.next);
    count = 1;
  }

  public DDList() {
    sentinel = new IntNode(0, null, null);
    count = 0;
  }

}
