package Estudiante;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void registrarAsignatura() {

        System.out.println("=== Registrar Asignatura ===");

        System.out.print("Ingrese el codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese los creditos: ");
        int creditos = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el docente: ");
        String docente = sc.nextLine();

        System.out.println("\nAsignatura registrada correctamente:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Creditos: " + creditos);
        System.out.println("Docente: " + docente);
    }

    public static void main(String[] args) {
        registrarAsignatura();
    }
    
    
}

