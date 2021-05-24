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

        //Ordenado pelo nome
        Precedente<Pessoa>[] arrOdernado = SortUtil.sort(arrPessoa);

        for (Precedente<Pessoa> pessoa : arrOdernado) {
            System.out.println(pessoa.getObject());
        }

        Celular c1 = new Celular(975550430L, "Rayan Salewski");
        Celular c2 = new Celular(971234567L, "Carol Shimada");
        Celular c3 = new Celular(982324242L, "Manuela Sandrini");

        Precedente<Celular>[] arrCelular = new Precedente[3];
        arrCelular[0] = c1;
        arrCelular[1] = c2;
        arrCelular[2] = c3;

        //Ordenado pelo numero
        Precedente<Celular>[] arrOdernadoCelular = SortUtil.sort(arrCelular);

        for (Precedente<Celular> celular : arrCelular) {
            System.out.println(celular.getObject());
        }

    }
}
