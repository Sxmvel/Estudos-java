package ad_hoc;

import java.util.Scanner;

public class tabuleiro {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Casas do tabuleiro
        int A = scanner.nextInt(); // Quantidade de armadilhas
        int D = scanner.nextInt(); // Quantidade de dados rolados

        // Criando o tabuleiro com as armadilhas

        boolean[] temArmadilha = new boolean[N + 1];

        for (int i = 0; i < A; i++) {

            int casaAmaldiçoada = scanner.nextInt();

            if (casaAmaldiçoada <= N) {
                temArmadilha[casaAmaldiçoada] = true;
            }

        }


        // Variáveis de controle de estado

        int pos1 = 0;
        int pos2 = 0;
        boolean preso1 = false;
        boolean preso2 = false;
        int turno = 1; // 1 = vez do Jogador 1, 2 = vez do Jogador 2


        // Lendo os dados e processando as jogadas NA HORA

        for (int i = 0; i < D; i++) {

            int dado = scanner.nextInt();

            // ---> SUA LÓGICA ENTRA AQUI <---
            // 1. Verifique de quem é a vez.



            // 2. Se o jogador estiver preso, libere ele (preso = false), passe o turno para o outro,
            // E NÃO ESQUEÇA QUE O DADO ATUAL AINDA PRECISA SER CONSUMIDO PELO OUTRO JOGADOR!

            if(preso1 == true || preso2 == true){
                preso1 = false;
                preso2 = false;
            }


            // 3. Se não estiver preso, ande as casas.



            // 4. Verifique se ganhou. Se ganhou, pare tudo!
            // 5. Verifique se caiu em uma armadilha e atualize o status dele.
            // 6. Troque o turno para o próximo jogador.

        }

        // ---> LÓGICA FINAL PARA DEFINIR O VENCEDOR <---
        // Quem está além do N? Ou é empate?

        scanner.close();




    }
}
