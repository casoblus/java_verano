public class CFormas
{

   /**
    * Cuadrado
    */
   private static void cuadrado()
   {
      int lado = 4;
      for ( int i = 0; i < lado; i++ ) 
      {
         System.out.print("\n");
         for (int j = 0; j <= lado; j++ ) 
         {
            System.out.print("*");
         }
      }
   }
   
   
   /**
    * Flecha
    */
   private static void flecha()
   {
      for ( int i = 0; i < 8; i++ ) 
      {

      }
   }
   
   
   /**
    * Rombo
    */
   private static void rombo()
   {}



   public static void main(String[] args)
   {
      cuadrado();
     // flecha();
     // rombo();
   }
}
