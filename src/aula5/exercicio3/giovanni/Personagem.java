package aula5.exercicio3.giovanni;

public class Personagem {

    private String nome;
    private ClassePersonagem classe;
    private Integer pontosDeVida;
    private Integer level;
    private Arma arma;

    public Personagem(String nome, ClassePersonagem classe, Integer pontosDeVida, Integer level, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.pontosDeVida = pontosDeVida;
        this.level = level;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    public Integer getPontosDeVida() {
        return pontosDeVida;
    }

    public Integer getLevel() {
        return level;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setPontosDeVida(Integer pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe=" + classe +
                ", pontosDeVida=" + pontosDeVida +
                ", level=" + level +
                ", arma=" + arma +
                '}';
    }
}
