public class Ce3 {
   public static void main (String[] args) {

      /* Mostrar el valor del elemento 6 del arreglo f */
      int[] f;
      System.out.print( f[6] );
      
      
      /* Inicializar con 8 cada uno de los cinco elementos del array b */
      int[] b;
      for ( int i = 0; i < 5; i++ ) {
         b[i] = 8;
      }
      
      
      /* Sumar el total de los 100 elementos del arreglo c en punto flotante */
      float[] c;
      float suma = 0;
      for (int i = 0; i < 100; i++ ) 
      {
         suma += c[i]; 
      }
      
      
      /* Copiar el arreglo a de 11 elementos en la primera porcion del arreglo b de 34 elementos */
      int[] a;
      for ( int i = 0; i < a.length; i++ ) {
        b[i] = a[i];
      } 
      
      
      /* Determinar e imprimir los valores menor y mayor contenidos en el arreglo w con 99 elementos en punto flotante */
      float[] w;
      float mayor = 0;
      float menor = 0;
      for (int i = 0; i < w.length; i++ )
      {
         if ( mayor < w[i] ) 
            mayor = w[i];
         else if ( menor > w[i] ) 
            menor = w[i];
      }
   }
}
