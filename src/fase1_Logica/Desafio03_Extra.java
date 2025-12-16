package fase1_Logica;

import java.util.Scanner;

public class Desafio03_Extra {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String login = "admin";
        String senha = "1234";

        System.out.println("Informe o login");
        String log = t.nextLine();
        System.out.println("Informe a senha");
        String sen = t.nextLine();

        String acesso = (!login.equals(log) || !senha.equals(sen)) ? "Login ou senha incorreto" : "Acesso permitido";
        System.out.println(acesso);
    }
}
