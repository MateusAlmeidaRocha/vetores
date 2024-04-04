import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int soma = 0;
    int media = 0;
    for (int i = 0; i < 10; i++) {
      System.out.println("Digite a temperatura: ");
      int temperatura = scanner.nextInt();
      soma += temperatura;
    }
    media = soma / 10;
    System.out.println("A média das temperaturas é: " + media);
  }
}