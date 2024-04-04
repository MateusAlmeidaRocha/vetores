public class Main {
  public static void main(String[] args) {
    int[] vetorA = new int[15];
    int[] vetorB = new int[15];
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = (int) (Math.random() * 100);
    }
    for (int i = 0; i < vetorA.length; i++) {
      vetorB[i] = vetorA[vetorA.length - 1 - i];
    }
    System.out.println("Vetor A:");
    for (int i = 0; i < vetorA.length; i++){
      System.out.print(vetorA[i] + " ");
    }
    System.out.println("\nVetor B:");
    for (int i = 0; i < vetorB.length; i++){
      System.out.print(vetorB[i] + " ");
    }
  }
}