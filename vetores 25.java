import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o valor do raio: ");
    double raio = teclado.nextDouble();
    double perimetro = 2 * 3.14 * raio;
    System.out.println("O perímetro do círculo é: " + perimetro);
  }
}