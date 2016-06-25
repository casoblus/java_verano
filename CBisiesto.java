import java.util.*;
public class CBisiesto
{
   private static Integer getYear()
   {
      Scanner sc = new Scanner( System.in );
      Integer year;
      try
      {
         year = Integer.parseInt( sc.nextLine() );
      } 
      catch(Exception e)
      {
         year = -1;
      }
      return year;
   }

   private static boolean div4(Integer y)
   {
      boolean divisible = ( y % 4 == 0 );
      return divisible;
   }

   private static boolean div100(Integer y)
   {
      boolean divisible = ( y % 100 == 0 );
      return divisible;
   }

   private static boolean div400(Integer y)
   {
      boolean divisible = ( y % 400 == 0 );
      return divisible;
   }
   
   private static boolean checkYear( Integer year )
   {
      boolean bisiesto = false;
      if ( div400(year) )
         bisiesto = true;
      else {
         bisiesto = div4(year) && !div100(year);
      }
      return bisiesto;
   }

   public static void main( String[] args )
   {
      Integer year;
      
      do
      {
         year = getYear();
      } 
      while( year < 0 );

      boolean esBisiesto = checkYear( year );

      System.out.printf( "\n esBisiesto = %b. \n", esBisiesto );
   }
}
