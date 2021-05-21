package aula4.exercicio3.ex2.utils;

import aula4.exercicio3.ex2.GeometricFigure;

public final class AreaMedia {
    public static double areaMedia (GeometricFigure arr []) {
        double sum = 0;
        for(GeometricFigure figure : arr){
            sum+=figure.area();
        }
        return sum / arr.length;
    }
}
