package doidera;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        System.out.println(parOuImpar(numero));
    }

    public static boolean parOuImpar(int numero){
        return numero % 2 == 0;
    }
}
