/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author PC
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String codigo; 
    private int semestre;
    private int edad; 
    
    
    
   public Estudiante(){
       
   }

    public Estudiante(String nombre, String apellido, String codigo, int semestre, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.semestre = semestre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", codigo=" + codigo + ", semestre=" + semestre + ", edad=" + edad + '}';
    }
    
    
   
    

    

  
    
    
    
    
    
    
   
}
