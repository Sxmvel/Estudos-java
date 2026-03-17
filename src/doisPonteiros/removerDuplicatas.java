package doisPonteiros;

import java.util.Arrays;

public class removerDuplicatas {

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4,5,5,6,7,7,8,8,9};

        int escritor = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[escritor] = nums[i]; // So chega aqui se o numero atual for diferente do anterior
                escritor++;
            }
        }

        System.out.println(escritor);
    }
}
