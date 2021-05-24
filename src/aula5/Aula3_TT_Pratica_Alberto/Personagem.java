package Aula3_TT_Pratica_Alberto;

import Aula3_TT_Pratica_Alberto.Classes.Classe;

public class Personagem {
    private String nome;
    private Integer nivel;
    private Classe classe;
    private Integer vida;
    private Arma arma;

    public Personagem(String nome, Integer nivel, Integer vida, Classe classe, Arma arma) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.vida = vida;
        this.arma = arma;
    }

    public void realizarAcao(){
        this.arma.acao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
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
