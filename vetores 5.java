public class Main {
  public static void main(String[] args) {
    int[] vetor = new int[15];
    int contador = 0;
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * 50) + 1;
      if (vetor[i] == 20) {
        System.out.println("O número 20 está no índice " + i);
        contador++;
      }
    }
    if (contador == 0) {
      System.out.println("O número 20 não está no vetor");
    }
  }
}