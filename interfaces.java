interface Flower {
   public void fragrance();
   public void beauty();
}

class Rose implements Flower {

   public void fragrance() {
      System.out.println("Rose petals can help increase circulation, fight depression and anxiety, relieve infections and combat viruses, among a number of other health benefits.");
   }

   public void beauty() {
      System.out.println("Beauty of Nature");
   }
}
class interfaces {
   public static void main(String args[]) {
      Rose r = new Rose();
      r.fragrance();
      r.beauty();
   }
}
