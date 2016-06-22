public class CTablas
{
   private static void tabla( byte n )
   {
      System.out.println( " Tabla de " +n );
      for( byte i = 0; i <= 10; i++ )
      {
         System.out.printf(" %d x %d = %d; \n", n, i, n*i );
      }
   }
   public static void main( String[] args )
   {
      for( byte i = 0; i <= 10; i++ )
      {
         tabla(i);
      }
   }
}
