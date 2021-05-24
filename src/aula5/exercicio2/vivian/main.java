package aula5.exercicio2.vivian;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Properties;

public class main {
    public static void main(String[] args) {
        Integer iArr[] = { 16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };
        Integer bArr[] = new Integer[5000];

        String sorterName = loadProperties();
        try {
            Constructor<?> construtor = Class.forName(sorterName).getConstructor();
            Sorter classe = (Sorter) construtor.newInstance();
            classe.sort(iArr,new Numero());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        for(int i= 0; i< 5000; i++){
            bArr[i] = (int) ((Math.random() * (10000 - 0)));
        }

    }

    private static String loadProperties(){
        try (InputStream input = new FileInputStream("src/resources/MyFactory.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return prop.getProperty("sorter");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return "";
    }
}
