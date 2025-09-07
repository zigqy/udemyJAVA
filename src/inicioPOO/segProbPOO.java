package inicioPOO;
import inicioPOO.entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class segProbPOO {
    // fazer programa para ler dados de um produto em estoque

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();
        System.out.println("Enter product data");
        System.out.println("Name: " );
product.name = sc.nextLine();
        System.out.println("Price: ");
product.price = sc.nextDouble();
        System.out.println("Quantity in stock:");
product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Products data: " + product);

        System.out.println("Enter the number of products to be added in stock: "); // adicao de produtos no estoque
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: "); //remoção de produtos do estoque
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();


    }
}
