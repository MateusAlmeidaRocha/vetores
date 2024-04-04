public class Main {
  public static void main(String[] args) {
    int[] vetor = new int[20];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * 30) + 1;
    }
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();
    boolean encontrado = false;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == 25) {
        encontrado = true;
        break;
      }
    }
    if (encontrado) {
      System.out.println("O número 25 foi encontrado no vetor.");
    } else {
      System.out.println("O número 25 não foi encontrado no vetor.");
    }
  }
}