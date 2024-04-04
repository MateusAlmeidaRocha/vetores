import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] entrada = new int[5];
    int[] saida = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o valor de entrada do mês " + (i + 1) + ": ");
      entrada[i] = scanner.nextInt();
      System.out.print("Digite o valor de saída do mês " + (i + 1) + ": ");
      saida[i] = scanner.nextInt();
    }
    int saldo = 0;
    for (int i = 0; i < 5; i++) {
      saldo += entrada[i] - saida[i];
    }
    System.out.println("O saldo final é: " + saldo);
  }
}