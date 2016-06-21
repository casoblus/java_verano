public class CDivisibles
{
   private static boolean divisibleEntreSiete( int i )
   {
      if( i % 7 == 0 )
         return true;
      return false;   
   }
   
   private static boolean divisibleEntreTres( int i )
   {
      if( i % 3 == 0 )
         return true;
      return false;   
   }

   public static void main( String[] args )
   {
      int suma = 0;
      for( int i = 100; i <= 150; i++ )
      {
         if( divisibleEntreSiete(i) )
         {
            if( divisibleEntreTres(i) )
            {
               suma += i;
            }
         }
      }
      System.out
         .println(suma);
   }
}
