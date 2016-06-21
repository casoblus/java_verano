import java.util.*;
public class CImc
{
   /**
    * Dado peso y altura calcula el imc
    */
   private static float cociente( float altura, float peso )
   {
      float imc;
      imc = peso / (altura * altura);
      System.out.println( imc );
      return imc;
   }

   private static String comprobarPeso( float cociente )
   {
      String c;

      if ( cociente <= 1 )
         c = "infrapeso";
      else if ( cociente < 18 ) 
         c = "bajo peso";
      else if ( cociente < 25 )
         c = "peso normal";
      else if ( cociente < 30 )
         c = "sobrepes";
      else if ( cociente < 35 ) 
         c = "sobrepeso cronico";
      else if ( cociente < 40 )
         c = "obesidad premorbida";
      else 
         c = "obesidad morbida";

      return c;
   }

   public static void main( String[] args )
   {
      Scanner sc = 
         new Scanner( System.in );
      float p, h;
 
      System.out
         .print("Introduce peso: ");
      p = 
         sc.nextFloat();
 
      System.out
         .print("Introduce altura: ");
      h = 
         sc.nextFloat();
 
      System.out
         .println( comprobarPeso( cociente( h, p ) ) );
   }
}
