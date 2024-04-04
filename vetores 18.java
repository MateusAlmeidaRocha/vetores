import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] temperaturas = new int[8];  
    for (int i = 0; i < 8; i++){
      System.out.print("Digite a temperatura " + (i + 1) + ": ");
      temperaturas[i] = scanner.nextInt();
    }
    int maiorTemperatura = temperaturas[0];
    for (int i = 1; i < 8; i++){
      if (temperaturas[i] > maiorTemperatura){
        maiorTemperatura = temperaturas[i];
      }
    }
    System.out.println("A maior temperatura registrada foi: " + maiorTemperatura);
  }
}