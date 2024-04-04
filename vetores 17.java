import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double soma = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
      double nota = scanner.nextDouble();
      soma += nota;
    }
    double media = soma / 10;
    System.out.println("A média das notas dos alunos é: " + media);
    scanner.close();
  }
}