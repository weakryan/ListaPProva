import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do produto: ");
        String nome = entrada.next(); 
        System.out.println("Insira o modelo do produto: ");
        String modelo = entrada.next();
        System.out.println("Insira o tamanho do produto: ");
        Float tamanho = entrada.nextFloat();
        System.out.println("Insira o preço do produto: ");
        Double preco = entrada.nextDouble();
        System.out.println("Insira a quantidade de produtos: ");
        int qtde = entrada.nextInt();
        
    }   
}
