import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] respostas = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite a resposta " + (i + 1) + ": ");
      respostas[i] = scanner.nextInt();
    }

    System.out.println("Respostas registradas na ordem inversa:");
    for (int i = 4; i >= 0; i--) {
      System.out.println("Resposta " + (i + 1) + ": " + respostas[i]);
    }
  }
}