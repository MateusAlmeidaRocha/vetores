import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetor3 = new int[20];
    int i, j, k;
    System.out.println("Digite os elementos do primeiro vetor:");
    for (i = 0; i < 10; i++){
      vetor1[i] = sc.nextInt();
    }
    System.out.println("Digite os elementos do segundo vetor:");
    for (i = 0; i < 10; i++){
      vetor2[i] = sc.nextInt();
    }
    i = 0;
    j = 0;
    k = 0;
    while (i < 10 && j < 10) {
      vetor3[k++] = vetor1[i++];
      vetor3[k++] = vetor2[j++];
    }
    while (i < 10) {
      vetor3[k++] = vetor1[i++];
    }
    while (j < 10) {
      vetor3[k++] = vetor2[j++];
    }
    System.out.println("Vetor resultante da intercalação:");
    for (i = 0; i < 20; i++) {
      System.out.print(vetor3[i] + " ");
    }  
  }
}