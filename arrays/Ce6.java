import java.util.*;
public class Ce6{
   public static void main (String[] args) {
      int s = 0;
      int b;
      Scanner sc = new Scanner(System.in);
      // define un array de enteros 5
      int[] a = new int[5];
      // solicita valores al usuario
      for (int i = 0; i < 5; i++ ){
         System.out.println("Inserta un numero: ");
         a[i] = sc.nextInt();
      } 
      // multiplica el elemento por 2
      for ( int j = 0; j < 5; j++ ){
         b = a[j]*2;

         // muestra resultado
         System.out.println(b);
      } 
      // muestra la suma de los elementos pares
      for (int p = 0; p < 5; p++ ){
         if( a[p] % 2 == 0 ){
            s += a[p];
         }
      } 
      System.out.println(s);
   }
}
