
package aula1;

import java.util.Scanner;

public class Teste {
    public static void main(String[]args){
        int n = 3;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        n = s.nextInt();
        
        if(n%2==0){
            System.out.println("par");
        }else{
            System.out.println("Impar");    
        }
        
    }
    
}