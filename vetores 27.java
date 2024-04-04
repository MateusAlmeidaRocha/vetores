import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    boolean[] modified = new boolean[5];
    for (int i = 0; i < array.length; i++) {
      System.out.print("Escreva o valor no lugar " + (i + 1) + ": ");
      array[i] = scanner.nextInt();
      modified[i] = false;
    }
    for (int i = 0; i < array.length; i++) {
      if (!modified[i]) {
        System.out.println("Valor " + (i + 1) + " pode ser modificado.");
        System.out.print("Escreva o novo valor no lugar " + (i + 1) + ": ");
        array[i] = scanner.nextInt();
        modified[i] = true;
        System.out.println("Valor " + (i + 1) + " foi modificado.");
      } else {
        System.out.println("Valor " + (i + 1) + " nao pode ser modificado.");
      }
    }

    scanner.close();
  }
}