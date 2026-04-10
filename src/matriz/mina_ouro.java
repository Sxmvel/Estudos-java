package matriz;

public class mina_ouro {

    static void main() {
        int[][] mina = {
                {5, 2, 8}, // Linha 0
                {9, 1, 4}, // Linha 1
                {3, 7, 6}  // Linha 2
        };

        int ouroTotal = 0;
        int linhaFixa = 1;

        for (int coluna = 0; coluna < 3; coluna++) {
            ouroTotal  += mina[linhaFixa][coluna];
        }

        System.out.println("Ouro total: " + ouroTotal);

    }
}
