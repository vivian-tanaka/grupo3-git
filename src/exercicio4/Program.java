package exercicio4;

import java.util.Scanner;

// Desenvolva um programa para mostrar por console os primeiros n números primos, sendo n um valor que o usuário irá inserir pelo console.
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();

        for(int i = 2; i <= n; i++){
            if(isNumeroPrimo(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isNumeroPrimo(int numero) {
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }
}
