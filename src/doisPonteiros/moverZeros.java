package doisPonteiros;


import java.util.Arrays;

public class moverZeros {

    public static void main(String[] args) {

        int[] nums = new int[]{0, 1, 0, 3, 12};

        int leitor = 0;
        int escritor = 0;

        for (int i = 0; i < nums.length; i++) {

            leitor = nums[i]; // Olha para o número atual

            if(leitor != 0){
                int aux = nums[escritor]; // recebe numero do indice do escritor = que é zero
                nums[escritor] = nums[i]; // Passa valor > 0 para inicio
                nums[i] = aux; // Recebe valor
                escritor++; // Escritor anda um indice.
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
