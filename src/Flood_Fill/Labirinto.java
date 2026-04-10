package Flood_Fill;

public class Labirinto {

    // 0 = Caminho livre | 1 = Parede | 2 = Caminho já percorrido (Pintado)
    static int[][] mapa = {
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1}
    };

    public static void floodFill(int linha, int coluna) {

        // Evita erro de acesso
        if(linha < 0 || linha >= 5 || coluna < 0 || coluna >= 5){
            return;
        }


        // Bateu na parede (1) ou já passou por aqui (2)?
        if(mapa[linha][coluna] != 0){
            return;
        }

        // 3. Se passou pelos guardiões, PINTA A CASA ATUAL!

        mapa[linha][coluna] = 2;

        // 4. As Chamadas Recursivas (Os 4 pontos cardeais)

        floodFill(linha + 1, coluna); // Sul
        floodFill(linha - 1, coluna); // Norte
        floodFill(linha, coluna + 1); // Leste
        floodFill(linha, coluna - 1); // Oeste

    }

    public static void main(String[] args) {

        floodFill(0, 0);

        // Imprimindo o mapa final

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(mapa[i][j] + " ");

            }
            System.out.println();
        }

    }
}
