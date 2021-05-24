package matheus.aula5.exercicio3.entities;

public class ArcoEFlecha extends Arma {

    @Override
    public void acao() {
        mirar();
        atirar();
        atirar(5);
    }

    public void mirar() {
        System.out.println("Mirou o arco e flecha");
    }

    public void atirar() {
        System.out.println("Disparou uma flecha!");
    }

    public void atirar(int quantidadeDeFlechas) {
        System.out.println("Disparou " + quantidadeDeFlechas + " flechas simultaneas!");
    }
}
