package Exercicio3;

import java.util.Scanner;

public class ConverterMetrosporCentimetros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe os metros: ");
        int metros = input.nextInt();
        input.close();

        int conversao = metros * 100;
        System.out.print(metros+"*m equivale a "+conversao+ "cm");
    }
}

