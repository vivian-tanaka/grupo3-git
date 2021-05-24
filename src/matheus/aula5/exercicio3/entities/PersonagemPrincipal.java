package matheus.aula5.exercicio3.entities;

public class PersonagemPrincipal {

    private String nome;
    private Classe classe;
    private Arma arma;

    public PersonagemPrincipal(String nome, Classe classe, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
    }

    public void realizaAcaoArma() {
        if(this.arma != null) {
            this.arma.acao();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
