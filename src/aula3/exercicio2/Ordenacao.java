package aula3.exercicio2;

import java.util.Arrays;
import java.util.Collections;

public class Ordenacao {

    public static void main(String[] args) {

        //List<Integer> numeros = Arrays.asList(52, 10, 85, 1324, 01, 13, 62, 30, 12, 127);
        int [] arr = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        Integer [] arr2 = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr2));
    }

}
