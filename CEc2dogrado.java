public class CEc2dogrado
{
   static Integer a = 20;
   static Integer b = 11111;
   static Integer c = 20;
   
   private static double raiz()
   {
      Integer k = b*b - 4*a*c;
      return Math.sqrt(k);
   }

   private static double raiz1()
   {
      return (-b+raiz())/2*a;
   }
   
   private static double raiz2()
   {
      return (-b-raiz())/2*a;
   }

   public static void main( String[] args )
   {
      System.out.println(raiz1());
      System.out.println(raiz2());
   }
}
