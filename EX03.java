import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int val1 = entrada.nextInt();
        System.out.print("Insira o segundo valor:");
        int val2 = entrada.nextInt();

        if (val1==val2) {
            System.out.println("Os valores são iguais. ");

        }else{
            System.out.println("Os valores são diferentes.");
    }
    
    }
}