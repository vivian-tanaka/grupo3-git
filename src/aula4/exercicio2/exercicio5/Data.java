package aula4.exercicio2.exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Data {

    private GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale("pt", "BR"));
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataAtual;

    public Data(){
        this.dataAtual = new Date();
        gregorianCalendar.setTime(dataAtual);
    }

    public Data(Date dataAtual){
        this.dataAtual = dataAtual;
        gregorianCalendar.setTime(this.dataAtual);
    }

    public Data(String data){
        try {
            this.dataAtual = sdf.parse(data);
            gregorianCalendar.setTime(this.dataAtual);
        } catch (ParseException e) {
            System.out.println("Não foi possível criar essa data");
        }
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
        gregorianCalendar.setTime(this.dataAtual);
    }

    public void setDataAtual(String dataAtual) {
        try {
            this.dataAtual = sdf.parse(dataAtual);
            gregorianCalendar.setTime(this.dataAtual);
        } catch (ParseException e) {
            System.out.println("Não foi possível criar essa data");
        }
    }

    public void addDay(){
        gregorianCalendar.add(Calendar.DAY_OF_MONTH,1);
        dataAtual = gregorianCalendar.getTime();
    }

    @Override
    public String toString() {
        return "Data{" +
                "dataAtual=" + sdf.format(dataAtual) +
                '}';
    }
}
