package inicioPOO.exerciciosPOO;
import inicioPOO.entities.Employee;
import java.util.Scanner;
import java.util.Locale;
public class ex2POO {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Employee emp = new Employee();
    Locale.setDefault(Locale.US);

    System.out.println("Nome:");
    emp.nome = sc.next();

    System.out.println("Valor do salário bruto: ");
    emp.grossSalary = sc.nextDouble();

    System.out.println("Taxa: ");
    emp.tax = sc.nextDouble();

    System.out.println();
    System.out.println("Employee: " + emp.nome + ", $ " + emp.netSalary());

    System.out.println();
    System.out.println("Which percentage to increase salary? ");

    double percentage = sc.nextDouble();
    emp.increaseSalary(percentage);

    System.out.println();
    System.out.println("Updated data: " + emp);


    sc.close();


}
}
