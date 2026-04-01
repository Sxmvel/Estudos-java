package recursao;

public class fatorial {

    public static int calcularFatorial(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
      int resultado =  calcularFatorial(5);

      System.out.println("O fatorial de 5 é: " + resultado);
    }
}
