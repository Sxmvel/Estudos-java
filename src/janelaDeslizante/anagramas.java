package janelaDeslizante;

public class anagramas {
    public static void main(String[] args) {

        String s = "anagrama";
        String t = "nagaraa";
        boolean b = true;

        char[] letraS = s.toCharArray();
        char[] letraT = t.toCharArray();

        if(letraS.length != letraT.length){
            b = false;
            System.out.println(b);
            System.exit(0);
        }

        int[] frequencia = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequencia[letraS[i] - 'a'] += 1; // Enche com a letra de S
            frequencia[letraT[i] - 'a'] -= 1; // Esvazia com a letra de T
        }

        for (int i = 0; i < frequencia.length; i++){
            if (frequencia[i] != 0) {
                b = false;
                System.out.println(b);
                break;
            }
        }
        System.out.println(b);

    }
}
