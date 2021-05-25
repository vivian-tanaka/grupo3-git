package aula06.Dakar.entities;

import java.util.*;
import java.util.stream.Collectors;

public class Corrida {
    private double distanciaEmKM;
    private double premioEmDolares;
    private String nome;
    private int quantidadeDeVeiculosPermitidos;
    private ArrayList<Veiculo> listaVeiculos;
    private HashMap<Integer, Double> podium = new HashMap<>();
    private ArrayList<Veiculo> podiumFinal = new ArrayList<>();

    public Corrida(double distanciaEmKM, double premioEmDolares, String nome, int quantidadeDeVeiculosPermitidos) {
        this.distanciaEmKM = distanciaEmKM;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }

    public void iniciarCorrida() {
        // Inicializa carros
        for (int i = 0; i < this.listaVeiculos.size(); i++) {
            podium.put(i, 0.0);
        }
        rodarDistancia();
    }

    private void rodarDistancia() {

        while (!todosVeiculosTerminaram()) {
            for (int i = 0; i < this.listaVeiculos.size(); i++) {
                Veiculo v = this.listaVeiculos.get(i);

                if (isVeiculoQuebrado(v)) {
                    System.out.println("Veículo " + i + " quebrou");
                    Socorrista socorrista = new Socorrista();
                    socorrista.socorrer(v);
                } else {
//                    double velocidadeCorrente = v.getAceleracao() * this.quantidadeDeHorasPassadas >= v.getVelocidade() ? v.getVelocidade() : v.getAceleracao() * this.quantidadeDeHorasPassadas;

                    double velocidadeCorrente = calculaVelocidadeCorrente(v);
                    v.setVelocidadeCorrente(velocidadeCorrente);

                    double distanciaAtual = podium.get(i);
                    double novaDistancia = velocidadeCorrente + distanciaAtual;

                    if (novaDistancia >= this.distanciaEmKM) {
//                    podiumFinal.add(v);
//                    podium.remove(i);
//                    removerVeiculo(v);
                        if(!v.isTerminouACorrida()){
                            v.setTerminouACorrida(true);
                            podiumFinal.add(v);
                        }
                        podium.put(i, distanciaEmKM);
                    } else {
                        podium.put(i, novaDistancia);
                    }
                }
            }

            ordernaPodium();
        }

        System.out.println("Podium final:");
        for (int i = 0; i < podiumFinal.size(); i++) {
            System.out.println((i+1) + " - " + podiumFinal.get(i).getPlaca());
        }
    }

    private void ordernaPodium() {
        List<Map.Entry<Integer, Double>> collect = podium.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed()).collect(Collectors.toList());

        HashMap<Integer, Double> novoPodium = new HashMap<>();
        for (Map.Entry me : collect) {
            novoPodium.put((Integer) me.getKey(), (Double) me.getValue());
            System.out.println(((Integer) me.getKey() + 1) + " na distancia " + podium.get((Integer) me.getKey()));
        }

        podium = novoPodium;

        System.out.println();
    }

    private boolean todosVeiculosTerminaram() {
        for (Map.Entry<Integer, Double> me : this.podium.entrySet()) {
            if (me.getValue() < this.distanciaEmKM) {
                return false;
            }
        }
        return true;
    }

    private boolean isVeiculoQuebrado(Veiculo v) {
        int rand = (int) ((Math.random() * (100 - 0)) + 0);
        return rand <= v.getTipoDeVeiculo().getChanceDeQuebrar();
    }

    private double calculaVelocidadeCorrente(Veiculo v) {
        return ((v.getAceleracao() + v.getVelocidade()) * 100) /
                (v.getAnguloDeGiro() * (v.getTipoDeVeiculo().getPeso() - (v.getTipoDeVeiculo().getQuantidadeDeRodas() * 100)));
    }

    public void registrarVeiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, TipoDeVeiculo tipoDeVeiculo, double velocidadeCorrente) {
        if (this.quantidadeDeVeiculosPermitidos > this.listaVeiculos.size()) {
            Veiculo veiculo = new Veiculo(velocidade, aceleracao, anguloDeGiro, placa, tipoDeVeiculo, velocidadeCorrente);
            this.listaVeiculos.add(veiculo);
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        Veiculo veiculo = getVeiculoPorPlaca(placa);
        this.listaVeiculos.remove(veiculo);
    }

    public Veiculo getVeiculoPorPlaca(String placa) {
        return this.listaVeiculos.stream().filter(v -> v.getPlaca().equals(placa)).findFirst().get();
    }

    public double getDistanciaEmKM() {
        return distanciaEmKM;
    }

    public void setDistanciaEmKM(double distanciaEmKM) {
        this.distanciaEmKM = distanciaEmKM;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeVeiculosPermitidos() {
        return quantidadeDeVeiculosPermitidos;
    }

    public ArrayList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
}
