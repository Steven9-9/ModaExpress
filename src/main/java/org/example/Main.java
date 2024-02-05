package org.example.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    String nombreCliente;
    String tipoCliente;
    Integer cantidadArticulos;
    Double precioTotal;

    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrsa tu nombre completo: ");
        nombreCliente = leer.nextInt();

        System.out.println("Bienvenido "+ nombreCliente + " a Moda Express.");

        System.out.println("Eres cliente VIP");
        tipoCliente = leer.nextLine();

        if(tipoCliente.equals('si')){

            System.out.println("******** Estas en cuenrta VIP *********");




        }else{}



    }
}