class constructor{
  int x;
  int y;
 // creating constructor
  constructor() {
    x=100;
    y=50;
  }

  public static void main(String[]args) {
    constructor constr = new constructor();
    System.out.println(constr.x + constr.y);
      System.out.println(constr.x - constr.y);
        System.out.println(constr.x * constr.y);
          System.out.println(constr.x / constr.y);
  }
}
