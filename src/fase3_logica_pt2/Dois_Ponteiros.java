package fase3_logica_pt2;

// Escreva um programa que inverta a ordem dos elementos de um array de inteiros.

import java.util.Arrays;

public class Dois_Ponteiros {

    public static void main(String[] args) {

        int nums [] = new int [] {1,2,3,4,5,6,7};


        int ponteiroEsquerda = 0;
        int ponteiroDireita = nums.length-1;

        while(ponteiroEsquerda < ponteiroDireita){

        int temp = nums[ponteiroEsquerda];

        nums[ponteiroEsquerda] = nums[ponteiroDireita];

        nums[ponteiroDireita] = temp;

        ponteiroEsquerda++;
        ponteiroDireita--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
