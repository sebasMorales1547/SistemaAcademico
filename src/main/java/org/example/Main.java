package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import Estudiante.Estudiante;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static ArrayList<Estudiantes> estudiantes = new ArrayList<>();
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Nota> Notas = new ArrayList<>();

    Scanner leer = new Scanner(System.in);

    static void main() {

        Main main = new Main();
        main.mostrarMenu();

        }

    public void mostrarMenu(){

        char confirmacion = 'S';  //para poder salir en el swtich
        int opcionEstudiante = 0; // para validar que esté entre el rango de opciones.

        do {
            System.out.println("""
                    
                    ¿Que acción desea hacer con el estudiante?
                    
                    1. registrar
                    2. listar
                    3. buscar
                    4. actualizar
                    5. eliminar
                    
                    6. salir del programa
                    
                    seleccione una opción
                    """);

            opcionEstudiante = leer.nextInt();

            switch (opcionEstudiante) {
                case 1:
                    System.out.println("Registrar estudiante");
                    break;
                case 2:
                    System.out.println("Listar estudiante");
                    break;
                case 3:
                    System.out.println("Buscar estudiante");
                    break;
                case 4:
                    System.out.println("Actualizar estudiante");
                    break;
                case 5:
                    System.out.println("Eliminar estudiante");
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.err.println("Opcion invalida, vuelva a ingresar");
            }


        }while (opcionEstudiante != 6);

    }

    public void registrarEstudiante(){

        System.out.println("Ingrese en nombre del estudiante");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el apellido del estudiante");
        String apellido = leer.nextLine();

        System.out.println("Ingrese el codigo del estudiante");
        String codigo = leer.nextLine();

        System.out.println("Ingrese el semestre del estudiante");
        int semestre = leer.nextInt();

        System.out.println("Ingrese la edad del estudiante");
        int edad = leer.nextInt();

        //Crear el objeto
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, codigo, semestre, edad);

        //añadir el objeto al arrayList
        estudiantes.add(nuevoEstudiante);
        System.out.println("El estudiante ha sido registrado correctamente");
    }

    public void listarEstudiante(){

        if (estudiantes.isEmpty()){
            System.err.println("No hay estudiantes registrados");
        }
        else {
            for (Estudiante e : estudiantes){
                System.out.println(e);
            }
        }

    }

    public void buscarEstudiante(){

        String codigo;
        boolean encontrado=false; //para mandar el mensaje de no encontrado

        System.out.println("Ingrese el codigo del estudiante");
        codigo = leer.nextLine();

        for (Estudiante e : estudiantes){
            if (codigo.equals(e.getCodigo())){
                System.out.println("Estudiante encontrado :");
                System.out.println(e);
                encontrado = true;
            }
        }

        if (encontrado == false){
            System.out.println("El estudiante no ha sido encontrado");
        }

    }


    }

