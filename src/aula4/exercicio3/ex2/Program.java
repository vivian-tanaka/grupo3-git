package aula4.exercicio3.ex2;

import aula4.exercicio3.ex2.figures.Circle;
import aula4.exercicio3.ex2.figures.Rectangle;
import aula4.exercicio3.ex2.figures.Triangle;
import aula4.exercicio3.ex2.utils.AreaMedia;

public class Program {
    public static void main(String[] args) {
        GeometricFigure circle = new Circle(5.0);
        GeometricFigure triangle = new Triangle(10.0, 20.0);
        GeometricFigure rectangle = new Rectangle(12.0, 12.0);

        GeometricFigure[] arr = { circle, triangle, rectangle};

        System.out.println("Circle area: " + String.format("%.4f", circle.area()));
        System.out.println("Triangle area: " + String.format("%.4f", triangle.area()));
        System.out.println("Rectangle area: " + String.format("%.4f", rectangle.area()));
        System.out.println();
        System.out.println("Average area of all figures: "+ String.format("%.4f", AreaMedia.areaMedia(arr)));
    }
}
