import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de recibos que deseja imprimir: ");
    int quantidadeRecibos = scanner.nextInt();
    int numeroRecibos = 1;
    while (numeroRecibos <= quantidadeRecibos) {
      System.out.println("Recibos " + numeroRecibos);
      numeroRecibos++;
    }
    scanner.close();
  }
}