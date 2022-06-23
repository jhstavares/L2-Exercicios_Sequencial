package Exercicio5;

import java.util.Scanner;

public class TransformacaoDeTemperaturaDeFahrenheitEmCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double TemperaturaEmFahrenheit = input.nextDouble();
        input.close();

        double informação = (TemperaturaEmFahrenheit - 32) * 5 / 9;
        System.out.printf("A converção de Fahrenheit, para graus Celsius é: %.2f ºC", informação);


    }
    
}

