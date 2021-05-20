package aula3.exercicio2;

import aula3.exercicio2.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrototipoSupermercado {

    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<Produto>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do Produto:" + i+1);
            String nome = sc.next();

            System.out.println("Digite o preco do Produto:" + i+1);
            double preco = sc.nextDouble();

            System.out.println("Digite a quantidade do Produto:" + i+1);
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nome, preco, quantidade);

            listaProdutos.add(produto);
        }

//        listaProdutos.stream().

        double soma = 0;
        for (Produto produto: listaProdutos) {
            System.out.println(produto);
            soma+= produto.getSubtotal();
        }

        System.out.println("Valor total: R$" + String.format("%.2f", soma));

    }

}
