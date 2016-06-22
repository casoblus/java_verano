public class CTofarenheit
{
   private static int toFarenheit(int c)
   {
      return (9/5)*c+32;
   }
   public static void main(String[] args )
   {
      for( int c = -30; c < 100; c+=5 )
      {
         System.out.printf( " %d C => %d F; \n ", c, toFarenheit(c));
      }
   }
}
