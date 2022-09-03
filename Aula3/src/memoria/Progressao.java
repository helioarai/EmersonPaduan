package memoria;

import java.util.Scanner;

public class Progressao {
    
    public static void main (String []args){
        
        System.out.println("Hello World");
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Insira o 1.o termo da progressão");        
        int primeiro = sc.nextInt();
        
        System.out.println(" Insira a razao da progressão");        
        int razao = sc.nextInt();
        
        System.out.println(" Insira o ultimo termo da progressão");        
        int ultimo = sc.nextInt();
        
        int total = somatoria (primeiro , razao, ultimo);
        
        System.out.println ("O total da somatoria da progressão é : "   + total);
    }

    private static int somatoria(int primeiro, int razao, int ultimo) {
        if (ultimo==primeiro)
            return primeiro ;
        return ultimo + somatoria (primeiro, razao, ultimo-razao);
    }
}
