package doisPonteiros;

public class oPangrama {

    public static void main(String[] args) {

        String texto = "thequickbrownfoxjumpsoverthelazydog";
        char[] letra = texto.toCharArray();
        int[] alfabeto = new int[26];

        boolean ehPangrama = true;

        for (int i = 0; i < texto.length(); i++) {
            alfabeto[letra[i] - 'a'] += 1;
        }

        for (int i = 0; i < alfabeto.length; i++) {
            if(alfabeto[i] == 0){
                ehPangrama = false;
                break;
            }
        }

        System.out.println(ehPangrama);

    }
}
