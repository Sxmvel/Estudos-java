import java.util.Scanner;

public class busca_Binaria {

    public static int buscar(int[] vetor, int alvo, int esquerda, int direita) {

        if (esquerda > direita) {
            return -1;
        }

        int meio = (direita + esquerda) / 2;

        if (vetor[meio] == alvo) {
            return meio;
        }

        if (alvo < vetor[meio]) {
            return buscar(vetor, alvo, esquerda, meio - 1);
        } else {
            return buscar(vetor, alvo, meio + 1, direita);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor OBRIGATORIAMENTE ordenado
        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        System.out.println("Qual numero voce quer buscar?");
        int alvo = scanner.nextInt();

        int posicao = buscar(numeros, alvo, 0, numeros.length - 1);

        if (posicao == -1) {
            System.out.println("Numero nao encontrado no vetor.");
        } else {
            System.out.println("Numero encontrado no indice: " + posicao);
        }

        scanner.close();
    }
}

