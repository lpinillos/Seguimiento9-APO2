import java.util.Scanner;

public class ProblemaB {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        int[] ids = new int[n];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = reader.nextInt();
        }

        for (int j = 0; j < ids.length; j++) {
            for (int i = 1; i < ids.length - j; i++) {
                if (ids[i - 1] < ids[i]) {
                    //NADA
                } else {
                    //SWAP
                    int anterior = ids[i - 1];
                    int actual = ids[i];
                    ids[i] = anterior;
                    ids[i - 1] = actual;
                }
            }
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (ids[i] != 0 && ids[i] == ids[i - 1]) {
                count++;
                if(i + 1 < n && ids[i] == ids[i + 1]){
                    count = -1;
                    break;
                }
            }
        }

        System.out.println(count);


    }

}
