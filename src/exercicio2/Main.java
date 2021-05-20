package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n;
        Integer m;

        System.out.println("Digite o n");
        n = scanner.nextInt();

        System.out.println("Digite o m");
        m = scanner.nextInt();

        for(int i = 1; i<=n; i++){
            if(i%m == 0) System.out.println(i);
        }

        scanner.close();

    }
}
