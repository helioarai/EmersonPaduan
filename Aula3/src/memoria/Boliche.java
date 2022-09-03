/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

import java.util.Scanner;

/**
 *
 * @author helio
 */
public class Boliche {

  
  public static void main (String[] args) {
  
      Scanner sc = new Scanner (System.in) ; 
      System.out.println("Coloque o numero de linhas que deseja ");
      int numLinhas = sc.nextInt();
      
      int totalPinos = calculaPinos (numLinhas);
      System.out.println("O numero de pinos e  : " + totalPinos);
      
      int totalPinosRec = calculaPinosRec (numLinhas);
      System.out.println("O numero de pinos e  : " + totalPinos);
    
  
  }

    private static int calculaPinos(int numLinhas) {
        int somaPinos =0 ;
        
        for (int i=1 ; i<=numLinhas; i++){
          somaPinos += i ;
        }
        return somaPinos ; 
     
    }

    private static int calculaPinosRec(int numLinhas) {
      //caso base
      if (numLinhas <=1)
         return 1;
      //caso recursivo
      return numLinhas + calculaPinosRec(numLinhas-1);
    }
  }
    
