package aula5.exercicio2.vivian;

import java.util.Comparator;

public interface Sorter<T> {
    public void sort(T arr[], Comparator<T> c);
}
