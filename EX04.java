import java.util.Scanner;
 public class EX04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu sálario: ");
        Double salario = entrada.nextDouble();

        System.out.println("Informe o valor da prestação: ");
        Double prestacao = entrada.nextDouble();

        if (prestacao>salario*20/100) {
            System.out.println("Empréstimo não concedido. ");

        }else{
            System.out.println("Empréstimo concedido.");
        }
        }

        
    






            
        
        

    }
