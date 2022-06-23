package Exercicio4;

import java.util.Scanner;

public class SalarioDosTrabalhadores {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Quanto voce ganha por hora trabalhada? ");
         double salario = input.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horas = input.nextDouble();

        input.close();

        double salariofinal = salario*horas;
        System.out.printf("O seu salário do mês é: R$ %.0f " , salariofinal);



    }

}
