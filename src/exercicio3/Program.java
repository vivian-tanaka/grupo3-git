package exercicio3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");

        int n = sc.nextInt();

        System.out.printf("O Numero que você digitou é divisivel por: ");
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                if (i == n){
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }

        sc.close();
    }
}
