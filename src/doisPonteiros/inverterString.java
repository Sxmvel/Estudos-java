package doisPonteiros;

public class inverterString {

    public static void main(String[] args) {

        String texto = "samuel";
        char[] t = texto.toCharArray();

        int esquerda = 0;
        int direita = texto.length()-1;

        while(esquerda < direita){

            char aux = t[direita];
            t[direita] = t[esquerda];
            t[esquerda] = aux;

            esquerda++;
            direita--;
        }
        System.out.println(new String(t));
    }

}
