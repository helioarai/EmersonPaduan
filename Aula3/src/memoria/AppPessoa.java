/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

/**
 *
 * @author helio
 */
public class AppPessoa {
    
    /**
     *
     * @param args
     */
    public static void main (String[] args) {
       
         Pessoa p1 = null ;
         Pessoa p2 ;
         
         p1= new Pessoa();
         p1.nome = "Helio";
         p1.idade = 23 ; 
         p2=p1 ;
         
         System.out.println(p1);
         System.out.println(p2);
         
         p1= null;
         p2= null;
         
         System.out.println(p1);

    }
    
}
