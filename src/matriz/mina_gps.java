package matriz;

public class mina_gps {

    public static void main(String[] args) {

        int[][] mina = {
                {5, 2, 8},
                {9, 1, 4},
                {3, 7, 6}
        };


        int minhaLinha = 1;
        int minhaColuna = 1;

        System.out.println("Eu estou no centro, tenho " + mina[minhaLinha][minhaColuna] + " pepitas.");



        System.out.println("Ouro ao Norte (Cima): "     + mina[  minhaLinha - 1  ][  minhaColuna  ]);
        System.out.println("Ouro ao Sul (Baixo): "      + mina[  minhaLinha + 1   ][  minhaColuna  ]);
        System.out.println("Ouro ao Leste (Direita): "  + mina[  minhaLinha ][  minhaColuna +1 ]);
        System.out.println("Ouro ao Oeste (Esquerda): " + mina[  minhaLinha  ][  minhaColuna  - 1 ]);
    }
}