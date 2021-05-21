package aula4.exercicio3.ex2.figures;

import aula4.exercicio3.ex2.GeometricFigure;

public class Circle extends GeometricFigure {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius*radius*Math.PI;
    }
}
