abstract class phone {
  public void call() {
    System.out.println("Calling....................");
  }
}

public class abstraction {
  public static void main(String args[]) {
    phone ph = new phone();
    ph.call();
  }
}
