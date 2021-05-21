package aula4.exercicio3.ex1;

public class StrongPassword extends Password{

    public StrongPassword(){
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
    }
}
