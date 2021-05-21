package matheus.exercicio4.entities;

public class FuncionarioCLT extends Funcionario{

    private Cargo cargo;
    private double metasBatidas;
    private double lucroDaEmpresa;

    public FuncionarioCLT(Cargo cargo, double metasBatidas, double lucroDaEmpresa) {
        this.cargo = cargo;
        this.metasBatidas = metasBatidas;
        this.lucroDaEmpresa = lucroDaEmpresa;
    }

    @Override
    public void pagarSalario() {
        double bonificacaoTotal = this.cargo.getBonificacao() * this.metasBatidas;
        this.setSalarioPago(this.cargo.getSalario() + ((this.cargo.getSalario() * bonificacaoTotal) / 100));

        if(this.cargo.equals(Cargo.DIRETOR)){
            this.setSalarioPago(this.getSalarioPago() + (this.lucroDaEmpresa * this.cargo.getParticipacaoDosLucros()));
        }
    }
}
