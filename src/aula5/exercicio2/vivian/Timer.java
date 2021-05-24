package aula5.exercicio2.vivian;

public class Timer {

    private Long startTime;
    private Long stopTime;

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        stopTime = System.currentTimeMillis();
    }

    public void reset(){
        startTime = 0L;
        stopTime = 0L;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Duração: ")
                .append(stopTime - startTime);

        return stringBuilder.toString();
    }

    public Long getTotalDuration(){
        return stopTime - startTime;
    }
}
