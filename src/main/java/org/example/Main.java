package org.example;
import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   // static ArrayList<Estudiantes> estudiantes = new ArrayList<>();
   // static ArrayList<Asignatura> asignaturas = new ArrayList<>();
   // static ArrayList<Nota> Notas = new ArrayList<>();

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


    }

