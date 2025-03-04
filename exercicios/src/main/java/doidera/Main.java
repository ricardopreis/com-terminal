package doidera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int numero1, numero2, numero3, numero4;

        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        numero3 = sc.nextInt();

        System.out.println("Informe o ultimo número: ");
        numero4 = sc.nextInt();
        
        System.out.println(soma(numero1, numero2, numero3, numero4));
        
    }
    public static int soma(int numero1, int numero2, int numero3, int numero4){
        int soma = numero1 + numero2 + numero3 + numero4;
        return soma;
        

    }
    
}