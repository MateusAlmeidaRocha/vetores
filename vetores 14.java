import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o número de etapas de produção: ");
    int numEtapas = scanner.nextInt();
    int tempoTotal = numEtapas * 30;
    System.out.println("O tempo total de produção é de " + tempoTotal + " minutos.");
  }
}