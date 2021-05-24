package aula5.exercicio2.vivian;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortImpl<T> implements Sorter<T>{

    @Override
    public void sort(T arr[], Comparator<T> c) {
        Timer timer = new Timer();

        timer.start();
        quickSort(arr, c, 0, arr.length - 1);
        timer.stop();

        System.out.println(timer.toString());;
        Arrays.asList(arr).stream().forEach(System.out::println);
    }

    private void quickSort(T[] vetor, Comparator<T> c, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, c, inicio, fim);
            quickSort(vetor, c, inicio, posicaoPivo - 1);
            quickSort(vetor, c, posicaoPivo + 1, fim);
        }
    }

    private int separar(T[] vetor, Comparator<T> c, int inicio, int fim) {
        T pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (c.compare(vetor[i], pivo) <= 0)
                i++;
            else if (c.compare(vetor[f], pivo) > 0)
                f--;
            else {
                T troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
