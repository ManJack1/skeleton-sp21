import java.security.PublicKey;

public class Main {

  public static void main(String[] args) {

    // IntList L = new IntList(1, null);
    //
    // L = new IntList(2, L);
    //
    // L = new IntList(3, L);
    // L = new IntList(4, L);
    // L = new IntList(5, L);
    // System.out.println(L.size());
    //
    // System.out.println(L.iteractiveSize());
    //
    // System.out.println(L.get(1));

    // TODO:SLList
    // SLList L = new SLList(10);
    // L.addFirst(10);
    // System.out.println(L.getFirst());
    // System.out.println(L.countSize());

    SLList<String> L = new SLList<String>();
    L.addLast("what");
    L.addLast("the");
    L.addLast("dog");
    L.addLast("doing");

    SLList<String> L2 = new SLList<String>();

    L2.addLast("dog");

  }
}
