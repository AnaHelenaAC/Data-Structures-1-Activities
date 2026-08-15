//1. Calcular o IMC (índice de massa corporal) de uma pessoa. Produza um alerta em caso de divisão por zero.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println("Seu IMC é: " + imc);
    
        }
    }
