package inicioPOO.entities;


public class Aluno {
    public String nome;
    public int idade;
    public double nota;

public     void exibirInfo(){
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade );
        System.out.println("Nota: " + nota );
    }
public boolean aprovado (){
        return nota >= 6.0;
    }
}