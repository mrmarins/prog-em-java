/*Construa um programa que exiba a 
tabuada de 1 até N, onde N é o número informado pelo usuário*/

import java.util.Scanner;

public class Tabuada{
    private int n;
    private Scanner s;
    
    public Tabuada(){
        n = 0;
        s = new Scanner(System.in);
    }
    
    public void mult(){
        System.out.println("Digite um número: ");        
        int n = s.nextInt();
        
            for (int j=1;j<=10;j++){
                int resultado = n * j;
                System.out.println("A tabuada do " + n + " * " + j + " é = " + resultado);              
            }
    }
    
    public static void main(String[] args) {
        Tabuada obj = new Tabuada();
        obj.mult();
    }
}    