package aula5.exercicio3.giovanni;

public class Program {

    public static void main(String[] args) {
        Arma espada = new Espada("Espada de aço", 20);
        Arma cajado = new Cajado("Cajado mágico", 30);
        Arma arco = new Arco("Arco élfico", 18);

        Personagem p1 = new Personagem("Aragorn", ClassePersonagem.GUERREIRO, 100, 15, espada);
        Personagem p2 = new Personagem("Gandalf", ClassePersonagem.MAGO, 80, 20,  cajado);
        Personagem p3 = new Personagem("Legolas", ClassePersonagem.ARQUEIRO, 90, 12,  arco);

        System.out.println(espada.atacar(p1, p2));
        System.out.println(cajado.atacar(p2, p3));
        System.out.println(arco.atacar(p3,p1));
    }

}
