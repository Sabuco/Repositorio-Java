public class DetectarNumeroDiferente {
    public static void main(String args[]) {
      int[] miArray = { 5,2,2,2,2 };
      int iterador = 0;
      int numDif = 0;
      int comparador = 0;
      
      for(int i=0; i < miArray.length; i++){
          iterador = miArray[i];
          if (i > 0){
              comparador = miArray[i-1];
          } else {
              comparador = miArray[i+1];
          }
          
          
          if (comparador != iterador && numDif != comparador) {
              numDif = iterador;
          }
          
          
      }
        
      System.out.println("El valor distinto del array es: " + numDif);
      
    }
}