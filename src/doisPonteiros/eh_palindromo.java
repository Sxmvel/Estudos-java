package doisPonteiros;


public class eh_palindromo {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,1};

        int esquerda = 0;
        int direita = nums.length-1;

       boolean isPalindromo = true;

        while(esquerda < direita){

            if(nums[esquerda] != nums[direita]){
                isPalindromo = false;
                break;
            }

            esquerda++;
            direita--;
        }
        System.out.println(isPalindromo);
    }
}
