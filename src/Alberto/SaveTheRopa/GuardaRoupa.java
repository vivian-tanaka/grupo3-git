package Alberto.SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private HashMap<Integer, List<Vestuario>> roupaCount;
    private Integer contador;

    public GuardaRoupa() {
        roupaCount = new HashMap<>();
        contador = 0;
    }

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario){
        // retornar a key para o valor fornecido
        // considerando listas unicas
        int key = 0;
        for (Map.Entry entry : roupaCount.entrySet()){
            if (entry.getValue().equals(listaDeVestuario)){
                key =  (Integer) entry.getKey();
            }
        }
        return key;
    }

    public void mostrarVestuarios(Integer key){
        /*
        for (Vestuario vestuario : roupaCount.get(key){
            System.out.println();
        }
        */
        for (int i = 0; i < roupaCount.size(); i++){
            System.out.println(roupaCount.get(key).get(i));
        }
    }

    public List<Vestuario> devolverVestuario(Integer id){
        return roupaCount.get(id);
    }

    public HashMap<Integer, List<Vestuario>> getRoupaCount() {
        return roupaCount;
    }

    // Cria uma nova posição no mapa e insere a lista
    public void addAoGuardaRoupa(List<Vestuario> listaadd) {
        contador++;
        this.roupaCount.put(this.contador, listaadd);
    }
}