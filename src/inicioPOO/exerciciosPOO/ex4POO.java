package inicioPOO.exerciciosPOO;

import inicioPOO.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ex4POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno alu = new Aluno();


        System.out.println("Aluno: ");
        alu.nome = sc.nextLine();

        System.out.println("Idade: ");
        alu.idade = sc.nextInt();

        System.out.println("Nota: ");
        alu.nota = sc.nextDouble();

        alu.exibirInfo();

        if (alu.aprovado()){
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
