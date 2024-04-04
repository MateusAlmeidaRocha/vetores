import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String[] carros = new String[5];
    double[] consumo = new double[5];
    double[] distancia = new double[5];
    double[] litros = new double[5];
    double[] valor = new double[5];
    double menor = 0;
    int posicao = 0;
    for (int i = 0; i < carros.length; i++){
      System.out.println("Informe o modelo do carro: ");
      carros[i] = leitor.next();
      System.out.println("Informe o consumo do carro: ");
      consumo[i] = leitor.nextDouble();
      System.out.println("Informe a distância: ");
      distancia[i] = leitor.nextDouble();
      litros[i] = distancia[i] / consumo[i];
      valor[i] = litros[i] * 4.89;
      if (i == 0){
        menor = valor[i];
      }
      else if (valor[i] < menor){
        menor = valor[i];
        posicao = i;
      }
    }
    System.out.println("O modelo de carro mais econômico é: " + carros[posicao]);
    for (int i = 0; i < carros.length; i++){
      System.out.println("O carro " + carros[i] + " gasta " + litros[i] + " litros para percorrer 1000 km.");
    }
  }
}