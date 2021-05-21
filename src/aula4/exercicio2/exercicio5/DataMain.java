package aula4.exercicio2.exercicio5;

import java.util.Date;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("25/06/2021");
        data.addDay();
        System.out.println(data.toString());

        Data data2 = new Data(new Date());
        data2.addDay();
        System.out.println(data2);

        Data data3 = new Data();
        System.out.println(data3);
    }
}
