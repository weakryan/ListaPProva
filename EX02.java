//package Atividades.Prova1;

import java.util.Scanner;
//package Atividades.Prova1;

public class EX02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1° valor para realizar a operação: "); 
        Double num1 = entrada.nextDouble();
        System.out.println("Digite o 2° valor para realizar a operação:");
        Double num2 = entrada.nextDouble();
        System.out.println("Digite a operacão que deseja usar: ");
        char operacao = entrada.next().charAt(0);

        Double total;
        switch (operacao) {
            case (char) '+':
            total = num1 + num2;
            System.out.println("O resultado é: " + total);
                break;
            case (char) '-':
            total = num1 - num2;
            System.out.println("O resultado é: " + total);
                break;
            case (char) '*':
            total = num1 * num2;
            System.out.println("O resultado é: " + total);
                break;
            
            case (char) '/':
            total = num1 * num2;
            System.out.println("O resultado é: " + total);
            default:
                break;

        }
        
        
    }
    }