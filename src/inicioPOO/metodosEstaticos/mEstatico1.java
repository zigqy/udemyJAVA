package inicioPOO.metodosEstaticos;

import util.Calculator;

import java.util.Scanner;

public class mEstatico1 {
   //final é pra falar que o valor é constante, e o padrao de constante é td maiusculo//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f" , c);
        System.out.println();
        System.out.printf("Volume: %.2f" , v);
        System.out.println();
        System.out.printf("PI Value: %.2f" , Calculator.PI);
sc.close();
    }


}