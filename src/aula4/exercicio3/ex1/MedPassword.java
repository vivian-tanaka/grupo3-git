package aula4.exercicio3.ex1;

public class MedPassword extends Password{

    public MedPassword(){
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$");
    }
}
