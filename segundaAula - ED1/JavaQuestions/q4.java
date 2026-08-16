//Distinguir, com base na média parcial do aluno, se ele está aprovado, reprovado ou na final. Aplique as regras da UFERSA.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas: ");
        double not1 = scanner.nextDouble();
        double not2 = scanner.nextDouble();
        double not3 = scanner.nextDouble();

        if ((not1 + not2 + not3) > 7.0) {
            System.out.println("Aprovado");}
        else if (((not1 + not2 + not3) >= 3.5) && ((not1 + not2 + not3) <= 7.0)) {
            System.out.println("Final");
        }
        else {
            System.out.println("Reprovado");
        }

        }
    }
