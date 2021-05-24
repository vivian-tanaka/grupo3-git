package aula5.exercicio2.vivian;

import java.util.Comparator;

public class QuickSortImpl implements Sorter<T>{


    @Override
    public void sort(T[] arr, Comparator<T> c) {
        Timer timer = new Timer();

        timer.start();
        quickSort(arr, 0, arr.length);
        timer.stop();

        System.out.println(timer.toString());;
    }

    private static void quickSort(T[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(T[] vetor, int inicio, int fim) {
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
