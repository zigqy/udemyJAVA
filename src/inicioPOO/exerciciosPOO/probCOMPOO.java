package inicioPOO.exerciciosPOO;

import inicioPOO.entities.Triangle;

import java.util.Scanner;
import java.util.Locale;

public class probCOMPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        Triangle x,y; // melhor doq criar um monte de double
    x = new Triangle();
    y = new Triangle();

        System.out.println("Digite o lado do triangulo X: ");
        x.a  = sc.nextDouble();
        x.b  = sc.nextDouble();
        x.c  = sc.nextDouble();
        System.out.println("Digite o lado do triangulo Y");
        y.a  = sc.nextDouble();
        y.b  = sc.nextDouble();
        y.c  = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf(" Lado do Triângulo X: %.4f" , areaX);
        System.out.printf(" Lado do Triângulo Y: %.4f" , areaY);

        if (areaX > areaY){
            System.out.println(" Maior área é a do X ");
        }else {
            System.out.println(" Maior área é a do Y ");
        }
    }
}
