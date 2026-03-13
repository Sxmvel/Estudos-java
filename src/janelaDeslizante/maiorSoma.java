package janelaDeslizante;

public class maiorSoma {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;
        int maiorSoma = 0;

        for (int i = 0; i < k; i++) {
            maiorSoma += nums[i];
        }
        int somaAtual = maiorSoma;

        // Vamos comecar a contar apartir de 3 e ir ate
        for (int i = k; i < nums.length; i++) {

            int numeroQueEntra = nums[i]; // Numero que vai entrar no indice. Se eu colocar K. Vai ficar fixa!
            int numeroQueSai = nums[i - k]; // Vamos remover o ultimo digito de cada janela

            somaAtual = somaAtual - numeroQueSai + numeroQueEntra;

            if (somaAtual > maiorSoma) {
                maiorSoma = somaAtual;
            }

        }
        System.out.println(maiorSoma);
    }
}
