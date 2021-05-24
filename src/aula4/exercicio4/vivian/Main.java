package aula4.exercicio4.vivian;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new FuncionarioCLT("Jose",CargoEnum.TECNICO);

        System.out.println(funcionario.pagarSalario());

        Funcionario funcionario2 = new FuncionarioPJ("Jose",20.0);
        funcionario2.setHorasTrabalhadas(40.0);

        System.out.println(funcionario2.pagarSalario());

        Funcionario diretor = new FuncionarioCLT("Jonas", CargoEnum.DIRETOR);
        diretor.cargo.getCargo().setLucroEmpresa(2454.0);

        System.out.println(diretor.pagarSalario());

    }
}
