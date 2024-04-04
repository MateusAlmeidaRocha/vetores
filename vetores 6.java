import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[30];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * 100) + 1;
    }
    System.out.print("Digite um valor: ");
    int valor = scanner.nextInt();
    boolean encontrado = false;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valor) {
        encontrado = true;
        break;
      }
    }
    if (encontrado){
      for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == valor) {
          for (int j = i; j < vetor.length - 1; j++) {
            vetor[j] = vetor[j + 1];
          }
          vetor[vetor.length - 1] = 0;
          break;
        }
      }
      System.out.println("Valor removido do vetor.");
    }
  }
}