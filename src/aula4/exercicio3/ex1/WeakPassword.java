package aula4.exercicio3.ex1;

public class WeakPassword extends Password{

    public WeakPassword(){
        super("^(?=.*[0-9])(?=.*[a-z]).{4,10}$");
    }
}
