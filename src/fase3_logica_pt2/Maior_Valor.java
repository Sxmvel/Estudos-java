package fase3_logica_pt2;


public class Maior_Valor {

    public static void main(String[] args) {
        int [] nums = new int [] {14,5,27,8,27,3};
        int maiorValor = nums[0];
        int indiceMaior = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > maiorValor){
                maiorValor =  nums[i];
                indiceMaior = i;
            }
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Indice do maior valor: " + indiceMaior);
    }
}
