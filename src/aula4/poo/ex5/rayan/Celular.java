package aula4.poo.ex5.rayan;

public class Celular implements Precedente<Celular>{
    private Long number;
    private String holder;

    public Celular(Long number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.number.compareTo(celular.getNumber());
    }

    @Override
    public Celular getObject() {
        return this;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                '}';
    }
}
