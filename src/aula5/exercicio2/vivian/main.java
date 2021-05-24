package aula5.exercicio2.vivian;

import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Integer iArr[] = { 16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };
        Integer bArr[] = new Integer[5000];

        for(int i= 0; i< 5000; i++){
            bArr[i] = (int) ((Math.random() * (10000 - 0)));
        }

        QuickSortImpl<Integer> qs = new QuickSortImpl<>();

        qs.sort(bArr, new Numero());
    }
}
