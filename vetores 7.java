public class Main {
  public static void main(String[] args) {
    double[] vetor = new double[5];
    double maior = 0, menor = 0;
    for (int i = 0; i < vetor.length; i++){
      System.out.println("Digite o valor da posição " + i + ": ");
      vetor[i] = Double.parseDouble(System.console().readLine());
    }
    for (int i = 0; i < vetor.length; i++){
      if (i == 0){
        maior = vetor[i];
        menor = vetor[i];
      } else {
        if (vetor[i] > maior){
          maior = vetor[i];
        }
        if (vetor[i] < menor){
          menor = vetor[i];
        }
      }
    }
    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
  }
}