package ad_hoc;

import java.util.Scanner;

public class bee_1087 {

    static void main() {
        Scanner t = new Scanner(System.in);

        while (t.hasNextInt()) {

            int x1 = t.nextInt();
            int y1 = t.nextInt();

            int x2 = t.nextInt();
            int y2 = t.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }

            if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            } else if (x1 == x2 || y1 == y2) {
                System.out.println(1);
            } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }

        }
        t.close();
    }

}
