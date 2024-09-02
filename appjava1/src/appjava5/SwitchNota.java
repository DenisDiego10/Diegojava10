package appjava5;

import java.util.Scanner;

public class SwitchNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        String conceito = "";

        System.out.print("Informe a nota: ");
        nota = entrada.nextInt();

        switch (nota) {

            case 10:
            case 9:

                conceito = "A";
                System.out.println("O conceito final é:" + conceito);

                break;
            case 8:
            case 7:

                conceito = "B";
                System.out.println("O conceito final é:" + conceito);
                break;
            case 6:
            case 5:
                conceito = "C";
                System.out.println("O conceito final é:" + conceito);
                break;
            case 4:
            case 3:
                conceito = "D";
                System.out.println("O conceito final é:" + conceito);
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                System.out.println("O conceito final é:" + conceito);
                break;

            default:
                System.out.println("Nota inválida");
                
        }

    }

}
