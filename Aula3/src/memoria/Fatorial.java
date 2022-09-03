package memoria;

import java.util.Scanner;


public class Fatorial {
    
      public static void main (String[] args) {
      
          Scanner sc = new Scanner(System.in);
          System.out.println("Coloque o número que deseja estudar");
          int numFatorial = sc.nextInt();
      
          int total = calculaFatorial (numFatorial);
          
          System.out.println("O fatorial do numero " + numFatorial + "  e " + total);
     
      }

    private static int calculaFatorial(int numFatorial) {
        if (numFatorial <=1)
            return 1;
        return numFatorial * calculaFatorial(numFatorial -1);
    }

    
}
