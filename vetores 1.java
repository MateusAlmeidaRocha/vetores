import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] vetor = new int[10];
    int i, j, cont = 0;
    for(i = 0; i < 10; i++){
      System.out.print("Digite um número: ");
      vetor[i] = input.nextInt();
    }
    for(i = 0; i < 10; i++){
      cont = 0;
      for(j = 1; j <= vetor[i]; j++){
        if(vetor[i] % j == 0){
          cont++;
        }
      }
      if(cont == 2){
        System.out.println("O número " + vetor[i] + " é primo e está na posição " + i);
      }
    }
  }
}