package exercicio2;

import java.util.Scanner;

public class MediaAritmetica {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Primeira nota bimestral: " );
            double nota1 = input.nextDouble();
            System.out.print("Segunda nota bimestral: ");
            double nota2 = input.nextDouble();
            System.out.print("Terceira nota bimestral: ");
            double nota3 = input .nextDouble();
            System.out.print("Quarta nota bimestral: ");
            double nota4 = input .nextDouble();
            input.close();

            double mediaDasNotas = (nota1 + nota2 + nota3 + nota4 ) / 4;
            System.out.printf("O calculo da média bimestral é: %.1f" , mediaDasNotas);


        }
}
