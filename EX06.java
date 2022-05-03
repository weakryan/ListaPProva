import java.util.Scanner;
public class EX06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Informe sua altura: ");
        Double altura = entrada.nextDouble();
        System.out.println("Informe seu sexo entre Homem e Mulher : ");
        String sexo = entrada.next();

        Double pesoH;
        pesoH = 72.2 * altura - 58;
        Double pesoM;
        pesoM = 62.1 * altura - 44.7;

        switch (sexo) {
            case "homem":
                System.out.println("Seu peso ideal é de: " + pesoH);

                break;
            case "mulher":
                System.out.println("Seu peso ideal é de: " + pesoM);
                
                break;
        
            default:
                break;
        }
    }
    
}
