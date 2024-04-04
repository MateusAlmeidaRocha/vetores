import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double[] preco = new double[10];
    int[] quantidade = new int[10];
    double[] valorTotal = new double[10];
    double[] valorUnitario = new double[10];
    double[] valorGeral = new double[10];
    double[] comissao = new double[10];
    double[] valorMaisVendido = new double[10];
    double[] posicao = new double[10];
    double valorGeralVendas = 0;
    double comissaoVendedor = 0;
    double maiorValor = 0;
    double maiorPosicao = 0;
    for (int i = 0; i < 10; i++){
      System.out.println("Digite o valor do produto: ");
      preco[i] = leitor.nextDouble();
      System.out.println("Digite a quantidade vendida: ");
      quantidade[i] = leitor.nextInt();
      valorTotal[i] = preco[i] * quantidade[i];
      valorUnitario[i] = preco[i];
      valorGeral[i] = valorTotal[i];
      comissao[i] = valorTotal[i] * 0.05;
      valorGeralVendas += valorTotal[i];
      comissaoVendedor += comissao[i];
      if (valorTotal[i] > maiorValor){
        maiorValor = valorTotal[i];
        maiorPosicao = i;
      }
    }
    System.out.println("Relatório de vendas: ");
    for (int i = 0; i < 10; i++){
      System.out.println("Quantidade vendida: " + quantidade[i]);
      System.out.println("Valor unitário: " + valorUnitario[i]);
      System.out.println("Valor total: " + valorTotal[i]);
      System.out.println("Comissão: " + comissao[i]);
    }
    System.out.println("Valor geral das vendas: " + valorGeralVendas);
    System.out.println("Valor da comissão que será paga ao vendedor: " + comissaoVendedor);
    System.out.println("O valor do objeto mais vendido: " + maiorValor);
  }
}