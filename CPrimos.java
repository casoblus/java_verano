public class CPrimos
{
   /**
    * Comprueba que es primo
    */
   private static boolean esPrimo( int numero )
   {
      boolean test = true;
      if( numero > 3 )
      {
         int i = 2;
         while( i < numero )
         {
            if( numero % i == 0 )
               return false;
            i++;
         }
      }
      return test;
   }

   /**
    * Método principal
    */
   public static void main( String[] args ) 
   {
      for( int i = 1; i <= 25; i++ )
      {
         if ( esPrimo(i) )
            System.out.println(i);
      }
   }
}
