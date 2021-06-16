/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Elija una opcion\n"
                + "1.Ingrese Estudiante\n"
                + "2.Ingrese Docente\n"
                + "3.ingrese Policia\n");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.printf("ingrese su Nombre: \n");
        String nom = sc.nextLine();
        System.out.printf("Ingrese su Apellido:\n ");
        String ape = sc.nextLine();
        System.out.printf("Ingrese su edad:\n ");
        int edad = sc.nextInt();

        if (opcion == 1) {
            System.out.printf("Ingrese valor Matricula\n");
            double ma = sc.nextDouble();
            Estudiante e = new Estudiante(nom, ape, edad, ma);
            System.out.println(e);
        }
        if (opcion == 2) {
            System.out.printf("Ingrese el Sueldo\n");
            double sue = sc.nextDouble();
            Docente d = new Docente(nom, ape, edad, sue);
            System.out.println(d);
        }
        if (opcion == 3) {
            System.out.printf("Ingrese el Rango\n");
            String ra = sc.nextLine();
            Policia po = new Policia(nom, ape, edad, ra);
            System.out.println(po);
        }

    }

}
