import java.util.*;
public class CNumeros
{
   private static int getNumber()
   {
      Scanner sc =
         new Scanner( System.in );
      Integer num;
      boolean NotANumber;
      do {
         NotANumber = false;
         try {
            num = Integer.parseInt(
                     sc.nextLine()
                     );
         } catch (Exception err) {
            num=0;
            NotANumber = true; 
         }
      } while (NotANumber);
      int n = num.intValue();
      return n;
   }


   private static int media( int a, int b, int c ) 
   {
      return ( a + b + c ) / 3;
   }


   private static int promedio( int a, int b, int c )
   {
      int promedio;
      int mayor = mayor(a,b,c);
      int  menor = menor(a,b,c);
      if ( a > menor && a < mayor )  
         promedio = a;
      else if ( b > menor && b < mayor )  
         promedio = b;
      else 
         promedio = c;    
      return promedio;
   }


   private static int mayor( int a, int b, int c )
   {
      int mayor;
      if( a > b && a > c )
         mayor = a;
      else if( a > b && a < c)
         mayor = c;
      else
         mayor = b;
      return mayor;
   }        
   

   private static int menor( int a, int b, int c )
   {
      int menor;
      if( a < b && a < c )
         menor = a;
      else if ( a < b && a > c )
        menor = c;
      else
        menor = b; 
      return menor;
   }


   public static void main (String[] args) {
      int a = getNumber();
      int b = getNumber();
      int c = getNumber();
      System.out.printf( "Mayor: %d; ", mayor(a,b,c) );
      System.out.printf( "promedio: %d; ", promedio(a,b,c) );
      System.out.printf( "menor: %d; ", menor(a,b,c) );
      System.out.printf( "media: %d.", media(a,b,c) );

   }
}
