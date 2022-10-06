import java.util.Scanner;

class ProblemaD {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sumKid = 0;
        int sumChef = 0;
        int differenceResult;

        //Preguntar numero de casos que se van a hacer
        int cases = reader.nextInt();

        for (int i = 0; i < cases; i++) {
            //Preguntar cantidad de objetos que se tienen
            int n = reader.nextInt();

            //Preguntar cantidad de objetos que se le van a dar al niño
            int k = reader.nextInt();

            if (k > n-k){
                k = n-k;
            }

            //Preguntar cantidad peso de cada elemento
            int[] weights = new int[n];
            for (int j = 0; j < weights.length; j++) {

                weights[j] = reader.nextInt();

            }

            for (int j = 0; j < weights.length; j++) {
                for (int l = 1; l < weights.length - j; l++) {
                    if (weights[l - 1] >= weights[l]) {
                        //SWAP
                        int anterior = weights[l - 1];
                        int actual = weights[l];
                        weights[l] = anterior;
                        weights[l - 1] = actual;
                    }
                }
            }

            for (int j = k; j < weights.length; j++) {
                sumChef += weights[j];
            }
            for (int j = 0; j < k; j++) {
                sumKid += weights[j];
            }

            differenceResult = sumChef - sumKid;

            System.out.println("\n" + differenceResult);
            sumChef = 0;
            sumKid = 0;


        }


    }

}
