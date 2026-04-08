package recursao;

import java.util.Scanner;

public class calcularDigitos {

    public static int somarDigitos(int n) {

        if (n == 0) {
            return 0;
        }
        return (n % 10) + somarDigitos(n / 10);

    }


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);


        int casos = t.nextInt();
        t.nextLine();

        for (int i = 0; i < casos; i++) {
            int n = t.nextInt();

            int total = somarDigitos(n);
            System.out.println(total);

        }
        t.close();

    }
}
