//Construa um programa que leia um número inteiro e identifique se ele é par ou ímpar.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();
        if ((num%2) == 0) {
            System.out.println("O número é par");}
        else {
            System.out.println("O número é impar");
        }

        }
    }
