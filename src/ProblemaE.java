import java.util.*;

public class ProblemaE {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int cases = reader.nextInt();
        Hashtable<Integer, Integer> order = new Hashtable<>();

        for (int i = 0; i < cases; i++) {

            //Cantidad de sapos
            int frogs = reader.nextInt();

            //Peso de los sapos
            int[] weights = new int[frogs];
            for (int j = 0; j < frogs; j++) {

                weights[j] = reader.nextInt();
                order.put(weights[j], j);

            }

            //Preguntar por lo que saltan los sapos
            int[] jump = new int[frogs];
            for (int j = 0; j < frogs; j++) {

                jump[j] = reader.nextInt();

            }

            //Ordenar el arreglo de pesos
            for (int j = 0; j < weights.length; j++) {
                for (int k = 1; k < weights.length - j; k++) {
                    if (weights[k - 1] < weights[k]) {
                        //NADA
                    } else {
                        //SWAP
                        int anterior = weights[k - 1];
                        int actual = weights[k];
                        weights[k] = anterior;
                        weights[k - 1] = actual;
                    }
                }
            }

            //ordenar los sapos
            int sum = 0;
            for (int j = 0; j < frogs - 1; j++) {
                int temp = order.get(weights[j]);
                int temp2 = order.get(weights[j + 1]);
                while (temp >= temp2) {
                    temp2 += jump[order.get(weights[j + 1])];
                    sum++;
                }
                order.put(weights[j + 1], temp2);
            }
            System.out.println(sum);
        }
    }
}
