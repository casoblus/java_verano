public class Ce4{
   public static void main (String[] args) {
      /* Crea un array con los caracteres de la a a la k */
      char[] arr = new char[11];
      for ( int i = 0; i <= 10; i++ ) {
         arr[i] = (char)(97 + i);
      }
      System.out.print( "\n" );
      for ( int i = 0; i <= 10; i++ ) {
        System.out.print( arr[i] );
      }
      System.out.print( "\n" );
      for ( int i = 0; i <= 10; i++ ) {
        if (  arr[i] == 'a' ||
              arr[i] == 'e' || 
              arr[i] == 'i' ||
              arr[i] == 'o' ||
              arr[i] == 'u')
           arr[i] = '*';
      }
      System.out.print( "\n" );
      for ( int i = 0; i <= 10; i++ ) {
        System.out.print( arr[i] );
      }
   }
}
