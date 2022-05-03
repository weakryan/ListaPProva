import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class EXO7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double valor = entrada.nextDouble();
        System.out.println("Digite o estado: ");
        String estado = entrada.next();

        Double MG;
        MG = 7 / 100 * valor;
        Double SP;
        SP = valor * 12 / 100;
        Double RJ;
        RJ = valor * 15 / 100;
        Double MS;
        MS = valor * 8 / 100;


        switch (estado) {
            case "MG":
                System.out.println("O valor real é de: " + MG);
                
                break;
            case "SP":
                System.out.println("O valor real é de: " + SP );

                break;
            case "RJ":
                System.out.println("O valor real é de: " + RJ );


                break;
            case "MS":
                System.out.println("O valor real é de: " + MS);
                
                break;

            default:
                break;
        }


    }
    
}
