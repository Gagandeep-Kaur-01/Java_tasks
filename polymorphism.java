class box {
  public void area() {
    System.out.println("Area of Geometry:");
  }
}


class rectangle extends box {
  public void area(int l, int b) {
//  return l*b;
int a = l*b;
System.out.println("Area of rectangle is:"+a);
  }
}


class square extends box
 {
  public void area(int a) {

     int ar= 4*a;
     System.out.println("Area of square is:"+ar);
  }
}


public class polymorphism {
  public static void main(String[] args)
  {
    box b = new box();
    rectangle rec = new rectangle();
    square sq = new square();

b.area();
rec.area(2,3);
sq.area(2);

  }
}
