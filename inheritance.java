class calculator {        // Super class   (Parent)
  public int add(int i, int j){
    return i+j;
  }
}

class calculate extends calculator {   // Sub class  (child)

  public int sub(int i, int j) {
    return i-j;
  }
}

public class inheritance {
  public static void main (String[] args)
  {
  //  calculator c = new calculator();
   calculate c1 = new calculate();

    int result1 = c1.add(10,20);
    System.out.println(result1);

    int result2 = c1.sub(16,7);
    System.out.println(result2);
  }
}
