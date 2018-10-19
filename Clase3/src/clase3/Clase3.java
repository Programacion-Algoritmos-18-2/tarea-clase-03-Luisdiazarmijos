/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        Trabajador1 t = new Trabajador1();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("Ingrese el sueldo de la primera semana del trabajador");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el sueldo de la segunda semana del trabajador");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el sueldo de la tercerasemana del trabajador");
        double c = scanner.nextDouble();
        System.out.println("Ingrese el sueldo  de la cuarta semana  del trabajador");
        double d = scanner.nextDouble();
        t.agregar_sueldo(a, b, c, d);

        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());

    }
}
