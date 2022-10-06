import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemaG {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList <Integer> barrels = new ArrayList<>();
        int cases = reader.nextInt();

        for (int i = 0; i < cases; i++) {
            barrels.clear();
            //Preguntar la cantidad de barriles
            int n = reader.nextInt();

            //Preguntar la cantidad de veces que se hace pasa el agua
            int k = reader.nextInt();

            if(k == n){
                k = n - 1;
            }

            for (int j = 0; j < n; j++) {
                int water = reader.nextInt();
                barrels.add(water);
            }

            //hacer con collection.sort()
            Collections.sort(barrels);
            long sum = 0;
            for (int j = barrels.size() - 1; k >= 0; j--) {
                sum += barrels.get(j);
                k--;
            }

            System.out.println(sum);

        }


    }

}
