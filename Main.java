package dsad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //doidera
        System.out.println("Informe um número: ");
        String numero = sc.nextLine();

        if(numero.equals("1")){
            System.out.println(retornaVerao(numero));
        }
        else if(numero.equals("2")){
            System.out.println(retornaInverno(numero));
        }
        else if(numero.equals("3")){
            System.out.println(retornaOutono(numero));
        }
        else if(numero.equals("4")){
            System.out.println(retornaPrimavera(numero));
        }
        else{
            System.out.println("Número inválido!");
        }
        
    }
    public static String retornaVerao(String numero){
        String verao = "É verão e o tempo está quente!";
        return verao;
    }
    public static String retornaInverno(String numero){
        String inverno = "É inverno e o tempo está frio!";
        return inverno;
    }
    public static String retornaOutono(String numero){
        String outono = "É outono e folhas secaram!";
        return outono;
    }
    public static String retornaPrimavera(String numero){
        String primavera = "É primavera e as flores estão florindo!";
        return primavera;
        }
}
