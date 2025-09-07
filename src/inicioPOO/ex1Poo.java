package inicioPOO;
import inicioPOO.entities.Rectangle;
import java.awt.*;
import java.util.Scanner;

public class ex1Poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width: ");
        rect.width = sc.nextDouble();

        System.out.println();
        System.out.println("Enter rectangle height: ");
        rect.height = sc.nextDouble();

        System.out.println("AREA " + rect.Area());
        System.out.println("PERIMETER " + rect.perimeter());
        System.out.println("DIAGONAL " + rect.diagonal());

        sc.close();
}}
