package aula5.exercicio2.vivian;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortImpl<T> implements Sorter<T>{

    public void sort(T[] v, Comparator<T> c) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("BubbleSort: ");
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        Timer timer = new Timer();

        timer.start();

        for(int i = 0; i < v.length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < v.length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
                if(c.compare(v[j], v[j + 1]) > 0) {
                    T aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        timer.stop();
        System.out.println(timer.toString());
        Arrays.asList(v).stream().forEach(System.out::println);
    }
}
