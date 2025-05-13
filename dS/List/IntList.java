public class IntList {

  public int size() {
    if (rest == null) {
      return 1;
    }
    return 1 + rest.size();
  }

  public int iteractiveSize() {
    int totalsize = 0;
    IntList p = this;
    while (p != null) {
      totalsize += 1;
      p = p.rest;
    }
    return totalsize;
  }

  // return the i'th item in the list
  public int get(int i) {
    if (i == 0) {
      return first;
    }
    return rest.get(i - 1);

  }

  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    this.first = f;
    this.rest = r;
  }

}
