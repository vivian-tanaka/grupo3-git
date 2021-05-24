package aula4.poo.ex5.rayan;

public final class SortUtil<T> {

    public static <T> Precedente<T> [] sort (Precedente <T> arr []){

        for(int i = 0; i < arr.length - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < arr.length - 1 - i; j++) {
        /* Se o nome do animal na posição atual do vetor for maior que o nome
           do proximo animal, então troca os Animais de lugar no vetor. */
                if(arr[j].precedeA((T) arr[j + 1]) > 0) {
                    Precedente<T> aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    estaOrdenado = false;
                }
            }
            // Se o vetor está ordenado então para as iterações sobre ele.
            if(estaOrdenado) break;
        }

        return arr;
    }
}
