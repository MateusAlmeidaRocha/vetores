import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite os preços dos 10 produtos:");
    double[] precos = new double[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Produto " + (i + 1) + ": ");
      precos[i] = scanner.nextDouble();
    }
    for (int i = 0; i < precos.length - 1; i++) {
      for (int j = 0; j < precos.length - i - 1; j++) {
        if (precos[j] > precos[j + 1]) {
          double temp = precos[j];
          precos[j] = precos[j + 1];
          precos[j + 1] = temp;
        }
      }
    }
    System.out.println("Preços em ordem crescente:");
    for (int i = 0; i < precos.length; i++){
      System.out.println(precos[i]);
    }
  }
}