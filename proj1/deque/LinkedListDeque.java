public class LinkedListDeque<type> {
  private class IntNode {
    private type item;
    public IntNode next;
    public IntNode prev;
   
    public IntNode(type i,IntNode n,IntNode p){
      this.item = i;
      this.next = n;
      this.prev = p;
    }
  }

  private IntNode sentinel_begin;
  private IntNode sentinel_end;
  private int count = 1;

  public SLList(type x){
    sentinel_begin = new IntNode(null,null,null);
    sentinel_end = new IntNode(null,null,null);
    sentinel_begin.next = new IntNode(x,sentinel_begin.next,sentinel_end.prev)
  }

  public void addFirst(type item) {

  }
    

  
}
