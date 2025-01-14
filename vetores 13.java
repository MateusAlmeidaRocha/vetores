import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int n = scanner.nextInt();
    System.out.println("Números primos menores ou iguais a " + n + ":");
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }
  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}