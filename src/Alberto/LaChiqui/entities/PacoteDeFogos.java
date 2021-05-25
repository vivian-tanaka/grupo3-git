package Alberto.LaChiqui.entities;

import java.util.ArrayList;

public class PacoteDeFogos {

    private ArrayList<PacoteDeFogos> pacotesDeFogos;
    private ArrayList<FogosDeArtificio> fogosDeArtificios;

    public PacoteDeFogos() {
        pacotesDeFogos = new ArrayList<>();
        fogosDeArtificios = new ArrayList<>();
    }

    public void explodir(){
        for(PacoteDeFogos pacoteDeFogos : pacotesDeFogos) {
            pacoteDeFogos.explodir();
        }

        for (FogosDeArtificio fogosDeArtificio: fogosDeArtificios) {
            fogosDeArtificio.explodir();
        }

    }

    public void addPacoteDeFogos(PacoteDeFogos pacoteDeFogos) {
        this.pacotesDeFogos.add(pacoteDeFogos);
    }

    public void addFogos(FogosDeArtificio fogos) {
        this.fogosDeArtificios.add(fogos);
    }
}
