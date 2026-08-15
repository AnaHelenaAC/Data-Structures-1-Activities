//Construa um programa que calcule para o aluno sua média parcial e informe sua situação parcial (Aprovado, Recuperação ou Reprovado).
//Caso ele esteja em Recuperação, solicite a nota da 4ª prova, e informe a situação (Aprovado ou Reprovado). Utilize as regras da UFERSA.

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas: ");
        double not1 = scanner.nextDouble();
        double not2 = scanner.nextDouble();
        double not3 = scanner.nextDouble();

        if (((not1 + not2 + not3)/3) > 7.0) {
            System.out.println("Aprovado");}

        else if ((((not1 + not2 + not3)/3) >= 3.5) && ((not1 + not2 + not3) < 7.0)) {
            System.out.println("Final");
            System.out.println("Informe a nota 4:");
            double not4 = scanner.nextDouble();

            if (((not4 * 4) + ((not1 + not2 + not3)/3)*6) >= 7.0) {
                System.out.println("Aprovado");
            }
        }
        else {
            System.out.println("Reprovado");
        }

        }
    }
