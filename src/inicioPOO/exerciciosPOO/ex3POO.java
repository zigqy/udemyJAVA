package inicioPOO.exerciciosPOO;

import inicioPOO.entities.Student;

import java.util.Scanner;

public class ex3POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("Nome: " );
        stu.name = sc.nextLine();

        System.out.println("Primeira Nota: ");
        stu.grade1 = sc.nextDouble();

        System.out.println("Segunda Nota: ");
        stu.grade2 = sc.nextDouble();

        System.out.println("Terceira Nota: ");
        stu.grade3 = sc.nextDouble();

        System.out.printf("Nota final = %.2f" , stu.finalGrade());

        if (stu.finalGrade() >= 60.0){
            System.out.println(" Passou ");
        }else {
            System.out.println(" Reprovado ");
            System.out.printf("Faltam %.2f pontos%n" , stu.missingPoints());
        }
        sc.close();
    }
}
