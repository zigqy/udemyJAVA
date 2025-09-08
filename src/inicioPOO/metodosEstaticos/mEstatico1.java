package inicioPOO.metodosEstaticos;

import java.util.Scanner;

public class mEstatico1 {
    public static final double PI = 3.14159; //final é pra falar que o valor é constante, e o padrao de constante é td maiusculo//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f" , c);
        System.out.println();
        System.out.printf("Volume: %.2f" , v);
        System.out.println();
        System.out.printf("PI Value: %.2f" , PI);

    }

    public static double circumference(double radius){
        return 2 * PI * radius;
    }
    public static double volume(double radius){
        return 4 * PI * Math.pow(radius, 3) / 3 ;
    }
}