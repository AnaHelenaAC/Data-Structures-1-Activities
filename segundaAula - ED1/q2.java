//Construa um programa que calcule a área de um círculo, tendo como entrada o valor do raio, que deve ser positivo. Use o valor da constante PI
//vindo da biblioteca matemática.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = scanner.nextDouble();
        if (raio > 0) {
            double area = Math.PI * raio * raio;
            System.out.println("A área do círculo é: " + area);
        }
        
        }
    }
