package Alberto.LaChiqui.entities;

import java.util.ArrayList;

public class Evento {

    private ArrayList<Convidado> convidados;
    private ArrayList<PacoteDeFogos> fogos;

    public Evento() {
        this.convidados = new ArrayList<>();
        this.fogos = new ArrayList<>();
    }

    public void apagarAsVelas() {
        for (PacoteDeFogos pacote: fogos) {
            pacote.explodir();
        }

        for(Convidado c: convidados){
            c.comerBolo();
        }
    }

    public ArrayList<Convidado> getConvidados() {
        return convidados;
    }

    public void addConvidado(Convidado convidado) {
        this.convidados.add(convidado);
    }

    public ArrayList<PacoteDeFogos> getFogos() {
        return fogos;
    }

    public void addPacoteDeFogos(PacoteDeFogos fogos) {
        this.fogos.add(fogos);
    }
}
