import java.util.Scanner;

class ProblemaF {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();

        for (int i = 0; i < t; i++) {
            //Pedir el numero de caballos que se van a comparar
            int n = reader.nextInt();

            if(n < 2){
                n = 2;
            }

            //Pedir el skill de los caballos
            int[] skill = new int[n];
            for (int j = 0; j < skill.length; j++) {

                skill[j] = reader.nextInt();

            }

            for (int j = 0; j < skill.length; j++) {
                for (int l = 1; l < skill.length - j; l++) {
                    if (skill[l - 1] >= skill[l]) {
                        //SWAP
                        int anterior = skill[l - 1];
                        int actual = skill[l];
                        skill[l] = anterior;
                        skill[l - 1] = actual;
                    }
                }
            }

            int minimum = 1000000000;
            for (int j = 1; j < skill.length; j++) {
                int temp = skill[j] - skill[j - 1];
                if (temp < minimum) {
                    minimum = temp;
                }
            }

            System.out.println(minimum);

        }
    }

}
