package recursao;

public class contagemRegressiva {

    public static void  contagem (int n){

        if(n == 0){
            System.out.println("Fogo! ");
            return;
        }

        // Se não for 0, imprimimos o número atual
        System.out.println(n);

        contagem(n - 1); // CHAMADA RECURSIVAChamando a si mesma
    }

    public static void main(String[] args) {
        contagem(3);
    }
}
