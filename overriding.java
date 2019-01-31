class Flower {
   public void fragrance() {
      System.out.println("Just living is not enough...one must have sunshine, freedom, and a little flower");
   }
}

class Rose extends Flower {
   public void fragrance() {
      System.out.println("Rose petals can help increase circulation, fight depression and anxiety, relieve infections and combat viruses, among a number of other health benefits.");
   }
}


class Lavender extends Flower{
  public void fragrance(){
    System.out.println("Lavender has long been used in aromatherapy as an essential oil that helps many people relax and manage stress, anxiety and difficulty sleeping.");
      }
}

public class overriding {

   public static void main(String args[]) {
     Flower f = new Flower();
      Rose r = new Rose();
       Lavender l = new Lavender();
      f.fragrance();
      r.fragrance();
      l.fragrance();

   }
}
