package fase3_logica_pt2;

public class SomaAlvo {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 22;

        int esquerda = 0;
        int direita = nums.length - 1;


        while (esquerda < direita) {
            int soma = nums[esquerda] + nums[direita];

            if (soma == target) {
                System.out.println(esquerda);
                System.out.println(direita);
                break;
            } else if (soma < target) {
                esquerda++;
            } else {
                direita--;
            }
        }
    }
}
