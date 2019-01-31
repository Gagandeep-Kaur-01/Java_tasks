class rectangle {
  public int ar(int l, int b) {
    return l*b;
  }
}

class square extends rectangle
 {
  public int peri(int a) {

     return 4*a;
  }
}

public class geometry {
  public static void main(String[] args)
  {
    square a = new square();
    int rec = a.ar(5,4);
    System.out.println(rec);

    int sq = a.peri(4);
        System.out.println(sq);
  }
}
