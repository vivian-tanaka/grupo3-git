package aula4.exercicio3.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String regex;
    private String password;
    private Pattern pattern;

    public Password(){

    }

    public Password(String regex) {
        this.regex = regex;
        this.pattern = Pattern.compile(this.regex);
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public void setValue(String password){
        if(!isValid(password)){
            throw new RuntimeException("Password invalido");
        }
            this.password = password;
    }

    private boolean isValid(String password){
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
