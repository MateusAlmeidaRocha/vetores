import java.util.Scanner;
public class Main {
    public static boolean verificar(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
    public static void calcularMedia(int[] notas) {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        double media = (double) sum / notas.length;
        System.out.println("A média das notas é: " + media);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();

        int[] notas = new int[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        calcularMedia(notas);

        scanner.close();
    }
}
