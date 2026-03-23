package janelaDeslizante;

/*
A sua missão é desenvolver um algoritmo que receba o texto interceptado e a
senha original que você está iniciais (íprocurando,
e descubra todas as posições  ndices)
onde um anagrama da senha está escondido dentro do texto.
 */


import java.util.Arrays;

public class oDetetive {

    public static void main(String[] args) {

        String texto = "cbaebabacd";
        String senha = "abc";
        int k = senha.length();

        // Array texto
        char[] textoChar = texto.toCharArray();
        int[] frenquencia = new int[26];


        // Array gabarito senha
        int[] frenqSenha = new int[26];
        char[] senhaChar = senha.toCharArray();

        // Array da janela
        int[] janela = new int [26];


        // Enchendo o texto
        for (int i = 0; i < texto.length(); i++) {
            int indice = textoChar[i] - 'a';
            frenquencia[indice] += 1;
        }

        // Enchendo a senha
        for (int i = 0; i < k; i++) {

            int indice = senhaChar[i] - 'a';
            frenqSenha[indice] += 1;

            janela[indice] += 1;

            if(Arrays.equals(frenqSenha,janela)){
                System.out.println("ok");
            }


        }

    }

}
