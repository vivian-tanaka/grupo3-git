package aula3.exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RadixSort {

    public static void main(String[] args) {
        int iArr[] = { 16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };

        iArr = radixSor(iArr);

        for (int i : iArr) {
            System.out.print(i + " ");
        }
    }

    private static int[] radixSor(int [] iArr){
        String [] sArr = intArrToStrArr(iArr);
        aplicarPaddingNoArray(sArr);

        ArrayList<ArrayList<String>> listArrayList = separarValoresEmListas(sArr);

        iArr = sort(sArr, listArrayList);

        return iArr;
    }

    private static String [] intArrToStrArr(int [] iArr){
        List<String> stringList = Arrays.stream(iArr).mapToObj(i -> Integer.toString(i)).collect(Collectors.toList());
        String [] sArr = new String[stringList.size()];

        for (int i = 0; i < stringList.size(); i++) {
            sArr[i] = stringList.get(i);
        }

        return sArr;
    }

    private static int getMaiorQuantidadeDeDigitos(String [] sArr){
        int maiorQuantidadeDeDigitos = 0;
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].length() > maiorQuantidadeDeDigitos)
                maiorQuantidadeDeDigitos = sArr[i].length();
        }
        return maiorQuantidadeDeDigitos;
    }

    private static void aplicarPaddingNoArray(String [] sArr) {
        int length = getMaiorQuantidadeDeDigitos(sArr);
        for(int i = 0; i < sArr.length; i++){
            sArr[i] = String.format("%1$" + length + "s", sArr[i]).replace(' ', '0');
        }
    }

    private static ArrayList<ArrayList<String>> separarValoresEmListas(String [] sArr) {
        ArrayList<ArrayList<String>> listArrayList = new ArrayList<>();

        ArrayList<String> l0 = new ArrayList<String>();
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<String> l2 = new ArrayList<String>();
        ArrayList<String> l3 = new ArrayList<String>();
        ArrayList<String> l4 = new ArrayList<String>();
        ArrayList<String> l5 = new ArrayList<String>();
        ArrayList<String> l6 = new ArrayList<String>();
        ArrayList<String> l7 = new ArrayList<String>();
        ArrayList<String> l8 = new ArrayList<String>();
        ArrayList<String> l9 = new ArrayList<String>();

        listArrayList.add(l0);
        listArrayList.add(l1);
        listArrayList.add(l2);
        listArrayList.add(l3);
        listArrayList.add(l4);
        listArrayList.add(l5);
        listArrayList.add(l6);
        listArrayList.add(l7);
        listArrayList.add(l8);
        listArrayList.add(l9);

        return listArrayList;
    }

    public static String [] getListaConsolidada(ArrayList<ArrayList<String>> listArrayList) {
        ArrayList<String> stringList = new ArrayList<>();

        for (ArrayList<String> lst : listArrayList) {
            for (String str: lst) {
                stringList.add(str);
            }
        }

        String [] sArr = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            sArr[i] = stringList.get(i);
        }

        return sArr;
    }

    public static void zerarListas(ArrayList<ArrayList<String>> listArrayList) {
        for (ArrayList<String> lst: listArrayList) {
            lst.clear();
        }
    }

    public static int [] sort(String [] sArr, ArrayList<ArrayList<String>> listArrayList) {
        int quantidadeDeDigitos = getMaiorQuantidadeDeDigitos(sArr);

        for(int j = 1; j <= quantidadeDeDigitos; j++) {

            for (int i = 0; i < sArr.length; i++) {
                char ultimoChar = sArr[i].charAt(quantidadeDeDigitos - j);
                listArrayList.get(Character.getNumericValue(ultimoChar)).add(sArr[i]);
            }

            // Descomentar para progressão da ordenação
//            for (ArrayList<String> lst : listArrayList) {
//                System.out.println(lst);
//            }

            sArr = getListaConsolidada(listArrayList);
//            System.out.println(Arrays.toString(sArr));
            zerarListas(listArrayList);
        }

        int [] iArr = new int[sArr.length];
        for(int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.valueOf(sArr[i]);
        }

        return iArr;
    }

}