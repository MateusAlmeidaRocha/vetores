import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int codigo;
    int[] codigos = {110, 112, 130, 114, 119, 150, 160, 164};
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o código do produto: ");
    codigo = entrada.nextInt();
    if(codigo == codigos[0] || codigo == codigos[1] || codigo == codigos[2] || codigo == codigos[3] || codigo == codigos[4] || codigo == codigos[5] || codigo == codigos[6] || codigo == codigos[7]){
      System.out.println("O código está presente no estoque.");
    }
    else{
      System.out.println("O código não está presente no estoque.");
    }
  }
}