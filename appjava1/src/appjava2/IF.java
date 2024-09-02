package appjava2;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {
        double nota = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota: ");
        nota = entrada.nextDouble();
        double media = 7.0;
        if (nota >= 0 && nota <= 10) {
            if (nota >= 9.1) {
                System.out.println("\nConceito a\n");
                System.out.println("\nHall da Fama!\n");

            } else if (nota >= media) {
                System.out.println("Aprovado!");

            } else if (nota >= 3 && nota < media) {
                System.out.println("Recuperaçao");
            } else {
                System.out.println("Recuperação");

            }

        }
    }

}
