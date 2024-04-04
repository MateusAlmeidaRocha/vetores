import java.util.Scanner;
public class Main {
    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        boolean resultado = verificarPar(numero);
        System.out.println("O número é par? " + resultado);
    }
}
    
  

  
