package aula4.poo.ex5.rayan;

public class Program {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Rayan", "123456789012");
        Pessoa p2 = new Pessoa("Joaozinho", "987654321012");
        Pessoa p3 = new Pessoa("Ana", "123123123012");

        Precedente<Pessoa>[] arrPessoa = new Precedente[3];
        arrPessoa[0] = p1;
        arrPessoa[1] = p2;
        arrPessoa[2] = p3;

        Precedente<Pessoa>[] arrOdernado = SortUtil.sort(arrPessoa);

        for (Precedente<Pessoa> pessoa : arrOdernado) {
            System.out.println(pessoa.getObject());
        }


    }
}
