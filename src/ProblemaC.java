import java.util.Arrays;
import java.util.Scanner;

public class ProblemaC {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Ingresa el nombre del invitado
        String guestName = reader.nextLine();

        //Ingresa el nombre del anfitrión
        String hostName = reader.nextLine();

        //Ingrese la cadena de letras
        String letters = reader.nextLine();

        String names = guestName + hostName;

        char[] charArrayNames = names.toCharArray();

        for (int rojo = 0; rojo < charArrayNames.length - 1; rojo++) {
            for (int azul = rojo + 1; azul < charArrayNames.length; azul++) {
                if (charArrayNames[rojo] < charArrayNames[azul]) {
                    //NADA
                } else {
                    char valorRojo = charArrayNames[rojo];
                    char valorAzul = charArrayNames[azul];
                    charArrayNames[rojo] = valorAzul;
                    charArrayNames[azul] = valorRojo;
                }
            }
        }

        char[] charArrayLetters = letters.toCharArray();

        for (int rojo = 0; rojo < charArrayLetters.length - 1; rojo++) {
            for (int azul = rojo + 1; azul < charArrayLetters.length; azul++) {
                if (charArrayLetters[rojo] < charArrayLetters[azul]) {
                    //NADA
                } else {
                    char valorRojo = charArrayLetters[rojo];
                    char valorAzul = charArrayLetters[azul];
                    charArrayLetters[rojo] = valorAzul;
                    charArrayLetters[azul] = valorRojo;
                }
            }
        }

        if (Arrays.equals(charArrayNames, charArrayLetters)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /*
        char[] orderedNames = names.toCharArray();
        Arrays.sort(orderedNames);
        names = new String(orderedNames);
        System.out.println(names);

        char[] orderedLetters = letters.toCharArray();
        Arrays.sort(orderedLetters);
        letters = new String(orderedLetters);

        if (names.equals(letters)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

            */

    }
}
