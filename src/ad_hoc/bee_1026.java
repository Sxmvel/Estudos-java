package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee_1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(br.readLine() != null){
            long a = Long.parseLong(br.readLine());
            long b = Long.parseLong(br.readLine());
            System.out.println(a ^ b);
        }
        System.out.println();


    }


}

