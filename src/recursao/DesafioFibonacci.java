package recursao;

public class DesafioFibonacci {

    public static int fib(int n){

        if(n <= 1){
            return n;
        }

        int calculoFib = fib(n - 1) + fib(n - 2);
        return calculoFib;
    }


    public static void main(String[] args) {

        int resultado = fib(10);
        System.out.println(resultado);

    }
}
