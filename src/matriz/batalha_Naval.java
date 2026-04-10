package matriz;

public class batalha_Naval {

    public static void main(String[] args) {

        // Nosso oceano 3x3
        int[][] oceano = {
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int totalNavios = 0;

        // O 'for' de fora controla o Andar (Linha)
        for (int linha = 0; linha < 3; linha++) {

            // O 'for' de dentro controla a Porta (Coluna)
            for (int coluna = 0; coluna < 3; coluna++) {

                if(oceano[linha][coluna] == 1){
                    totalNavios+= 1;
                }

            }
        }

        System.out.println("Encontramos " + totalNavios + " navios no radar!");
    }
}