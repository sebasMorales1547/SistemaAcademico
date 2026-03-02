package Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> listaAsignaturas = new ArrayList<>();

    public static void registrarAsignatura() {
        System.out.println("=== Registrar Asignatura ===");

        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Creditos: ");
        int creditos = Integer.parseInt(sc.nextLine());

        System.out.print("Docente: ");
        String docente = sc.nextLine();

        String asignatura = "Codigo: " + codigo +
                " Nombre: " + nombre +
                " Creditos: " + creditos +
                " Docente: " + docente;

        listaAsignaturas.add(asignatura);

        System.out.println("Asignatura registrada correctamente.\n");
    }

    // Listar todas
    public static void listarAsignaturas() {
        System.out.println("=== Lista de Asignaturas ===");

        if (listaAsignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
        } else {
            for (String a : listaAsignaturas) {
                System.out.println(a);
            }
        }
        System.out.println();
    }

    // Buscar asignatura
    public static void buscarAsignatura() {
        System.out.println("=== Buscar Asignatura ===");
        System.out.print("Ingrese el codigo o nombre: ");
        String busqueda = sc.nextLine();

        boolean encontrada = false;

        for (String a : listaAsignaturas) {
            if (a.toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("Encontrada: " + a);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Asignatura no encontrada.");
        }

        System.out.println();
    }
    
    //Actualizar asignatura
public static void actualizarAsignatura() {
    System.out.println("=== Actualizar Asignatura ===");
    System.out.print("Ingrese el codigo  de la asignatura a actualizar: ");
    String busqueda = sc.nextLine();

    boolean encontrada = false;

    for (int i = 0; i < listaAsignaturas.size(); i++) {
        String a = listaAsignaturas.get(i);

        if (a.toLowerCase().contains(busqueda.toLowerCase())) {

            System.out.println("Asignatura encontrada: " + a);

            System.out.print("Nuevo codigo: ");
            String codigo = sc.nextLine();

            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Nuevos creditos: ");
            int creditos = Integer.parseInt(sc.nextLine());

            System.out.print("Nuevo docente: ");
            String docente = sc.nextLine();

            String asignaturaActualizada = "Codigo: " + codigo +
                    " Nombre: " + nombre +
                    " Creditos: " + creditos +
                    " Docente: " + docente;

            listaAsignaturas.set(i, asignaturaActualizada);

            System.out.println("Asignatura actualizada correctamente.\n");
            encontrada = true;
            break;
        }
    }

    if (!encontrada) {
        System.out.println("Asignatura no encontrada.\n");
    }
}

    public static void main(String[] args) {
        registrarAsignatura();
        registrarAsignatura();

        listarAsignaturas();
        buscarAsignatura();
        actualizarAsignatura();
    }
}
