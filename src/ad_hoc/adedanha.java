package ad_hoc;

public class adedanha {

    // Retornar a quantidade de dedos

    public static int retornaDedos(int n, int somaAmigos, int alvo) {

        for (int d = 0; d <= 20; d++) {
            int somaTotal = somaAmigos + d;

            // A contagem é circular: soma % n
            if (somaTotal % n == alvo) {
                return d;
            }
        }
        return -1; // Caso seja impossível
    }

    static void main() {

        // Exemplo: 4 crianças, amigos esticaram 5, queremos alvo 2

        int n = 4;
        int somaAmigos = 5;
        int alvo = 2;

        int resultado = retornaDedos(n, somaAmigos, alvo);
        System.out.println(resultado);

    }
}
