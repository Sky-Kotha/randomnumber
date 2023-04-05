public class random {
    public static void main( String args[] ) {
      int min = 1; // Minimum value of range
      int max = 1000; // Maximum value of range  
      System.out.println("Random value in int from "+ min + " to " + max + ":");

      for(int i=0;i<10;i++){
      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

      System.out.println(random_int);
      }
    }
}
