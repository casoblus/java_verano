import java.util.*;
public class CHoras 
{
   private static final Integer horasxsemana = 168;
   
   private static Integer getHoras()
   {
      Scanner sc = 
         new Scanner( System.in );
      Integer horas;
      System.out
         .print( "\n\n Introduce numero de horas: " );
      horas = 
         Integer.parseInt(
               sc.nextLine()
               );
      return horas;
   }

   private static Integer restoDias( Integer h )
   {
      return h % 24 ;   
   }
   
   private static Integer numDias( Integer horas )
   {
      return horas / 24;
   }
   
   private static Integer restoSemanas( Integer horas )
   {
      return horas - horas % horasxsemana;
   }
   
   private static Integer numSemanas( Integer horas )
   {
      return horas / horasxsemana;
   }
   
   private static void calculaSemanas( Integer tHoras )
   {
      Integer semanas =
         numSemanas( tHoras );
 
      tHoras = 
         tHoras - restoSemanas( tHoras );

      Integer dias =
         numDias( tHoras );
 
      Integer horas = 
         restoDias( tHoras );
 
      System.out
         .printf( " %d semanas, %d días y %d horas. \n", semanas, dias, horas );
   }
   public static void main( String[] args )
   {
      calculaSemanas( getHoras() );
   }
}
