import java.util.Scanner;
public class Ex08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um valor de 1 à 7: ");
        int valor = entrada.nextInt();

        switch (valor) {
            case 1:
                System.out.println("O dia referente ao número 1 é: Domingo.");
                break;
            case 3:
                System.out.println("O dia referente ao número 3 é: Terça-Feira");
                break;
            case 4:
                System.out.println("O dia referente ao número 4 é: Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia referente ao número 5 é: Quinta-feira");
                break;
            case 6:
                System.out.println("O dia referente ao número 6 é: Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia referente ao número 7 é: Sábado");
                break;
            case 2:
                System.out.println("O dia referente ao número 2 é: Segunda-Feira");
                break;
            default:
                break;
        }
    
    }
}
