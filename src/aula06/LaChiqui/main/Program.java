package aula06.LaChiqui.main;

import aula06.LaChiqui.entities.*;

public class Program {

    public static void main(String[] args) {
        Evento evento = new Evento();

        Convidado c1 = new ConvidadoMeli();
        Convidado c2 = new ConvidadoMeli();
        Convidado c3 = new ConvidadoMeli();
        Convidado c4 = new ConvidadoStandard();
        Convidado c5 = new ConvidadoStandard();

        evento.addConvidado(c1);
        evento.addConvidado(c2);
        evento.addConvidado(c3);
        evento.addConvidado(c4);
        evento.addConvidado(c5);

        PacoteDeFogos p1 = new PacoteDeFogos();
        p1.addFogos(new FogosDeArtificio());
        p1.addFogos(new FogosDeArtificio());
        p1.addFogos(new FogosDeArtificio());

        PacoteDeFogos p2 = new PacoteDeFogos();
        p2.addFogos(new FogosDeArtificio());
        p2.addFogos(new FogosDeArtificio());

        p1.addPacoteDeFogos(p2);

        evento.addPacoteDeFogos(p1);

        evento.apagarAsVelas();
    }
}
