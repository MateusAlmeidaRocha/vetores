public class Main {
  public static void main(String[] args) {
    int[] vetor = new int[10];
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * 100);
      soma += vetor[i];
    }
    double media = soma / vetor.length;
    System.out.println("A média dos elementos do vetor é: " + media);
  } 
}