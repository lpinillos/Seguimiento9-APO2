import java.util.Scanner;

public class ProblemaA {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Problema 1
        String unsortedOP = reader.nextLine();
        String[] numbers = unsortedOP.split("\\+");
        bubble(numbers);

        String result = "";
        for (int i = 0; i < numbers.length; i++) {

            result += numbers[i] + "+";
        }
        System.out.println(result.substring(0,result.length()-1));

    }

    public static void bubble(String[] arr){
        for(int j=0 ; j<arr.length ; j++){
            for(int i=1 ; i<arr.length-j ; i++){
                if(arr[i-1].compareTo(arr[i]) < 0){
                    //NADA
                }else{
                    //SWAP
                    String anterior = arr[i-1];
                    String actual = arr[i];
                    arr[i] = anterior;
                    arr[i-1] = actual;
                }
            }
        }
    }


}
