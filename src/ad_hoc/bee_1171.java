package ad_hoc;


import java.util.Arrays;
import java.util.Scanner;

public class bee_1171 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int casos = t.nextInt();

        int [] array = new int[casos];

        for (int i = 0; i < casos; i++) {
            array[i] = t.nextInt();
        }

        Arrays.sort(array);

        int contador = 1;

        for (int i = 1; i < casos; i++) {
            if(array[i] == array[i-1]){
                contador++;
            }
            else {
                System.out.println(array[i - 1] + " aparece " + contador + " vez(es)");
                contador = 1;
            }

        }
        System.out.println(array[casos - 1] + " aparece " + contador + " vez(es)");

    }
}
