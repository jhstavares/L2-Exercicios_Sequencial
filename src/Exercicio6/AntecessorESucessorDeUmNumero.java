package Exercicio6;

import java.util.Scanner;

public class AntecessorESucessorDeUmNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numerointeiro = input.nextInt();
        input.close();

        int antecessor = numerointeiro - 1;
        System.out.println("O antecessor do numero "+ numerointeiro + " é: "+antecessor);
        int Sucessor = numerointeiro + 1;
        System.out.println("O Sucessor do numero "+ numerointeiro + " é: "+Sucessor);



    }
}
