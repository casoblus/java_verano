public class CPares
{
   /**
    * Comprueba si un numero es par
    */
   private static boolean isEven( int numero )
   {
      if ( numero % 2 == 0 )
      {
         return true;
      }
      return false;
   }

   public static void main( String[] args )
   {
      for( int i = 0; i < 100; i++ )
      {
         if ( isEven(i) )
         {
            System.out.println(i);
         }
      }
   }
}
