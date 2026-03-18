package beecrowd;


import java.util.Scanner;

public class cifraCesar_bee {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int casos = t.nextInt();
        t.nextLine();

        for (int i = 0; i < casos; i++) {

            String palavra = t.nextLine();
            char[] caracter = palavra.toCharArray();
            int cifra = t.nextInt();
            t.nextLine();
            for (int j = 0; j < palavra.length(); j++) {

                char letraAtual = caracter[j];
                int valorDescrip = letraAtual - cifra;

                if (valorDescrip < 'A') {
                    valorDescrip = valorDescrip + 26;
                }
                caracter[j] = (char) valorDescrip;
            }
            System.out.println(new String(caracter));
        }


    }
}
