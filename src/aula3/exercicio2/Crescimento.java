package aula3.exercicio2;

public class Crescimento {

    public static void main(String[] args) {

        int ano = 2021;
        double valorEmpresa1 = 1.13;
        double valorEmpresa2 = 18.4;

        double crescimentoEmpresa1 = 1.48;
        double crescimentoEmpresa2 = 0.32;

        System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + valorEmpresa1 + "m");
        System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + valorEmpresa2 + "m");
        System.out.println();

        do{
            ano++;
            valorEmpresa1 = valorEmpresa1 + (valorEmpresa1 * crescimentoEmpresa1);
            valorEmpresa2 = valorEmpresa2 + (valorEmpresa2 * crescimentoEmpresa2);

            System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + String.format("%.2f", valorEmpresa1) + "m");
            System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + String.format("%.2f", valorEmpresa2) + "m");

            System.out.println();
        }while(valorEmpresa1 < valorEmpresa2);


    }

}
