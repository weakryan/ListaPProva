import java.util.Scanner;
public class EX05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        Double valor1 = entrada.nextDouble();
        Double quadrado;
        quadrado = valor1 * valor1;
        Double raiz;
        raiz = Math.sqrt(valor1);

        if (valor1>0) {
            System.out.println("O número é positivo, esse valor ao quadrado é: " + quadrado + ". Sua raiz quadrada é: " + raiz);

        }else{
            System.out.println("Número negativo :/// ");
        }
            
        }
    }
