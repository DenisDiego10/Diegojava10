package appjava4;
import java.util.Scanner;

public class Tarefa1 {


    public static void main(String[] args) {


        int contdiv = 0, n1,n2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um numero inteiro; '");

        int numero = entrada.nextInt();

        for (int i =1; i <= numero; i++){
            if(numero % i == 0){
                contdiv ++;

            }

        }

        switch (contdiv) {
            case 1:
                System.out.println("Número Especial");
                break;
            case 2:
                System.out.println("É primo!");
        
            default:
            System.out.println("Não é primo");
                break;
        }

        
        
        entrada.close();
        

    


        
            
            
            
            


    
    

    } 
    

}
