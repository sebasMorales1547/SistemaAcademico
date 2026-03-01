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
    private float codigo; //Numnero de identificacion.
    private String Programa;
    private int semestre;
    
    
    
   public Estudiante(){
       
   }
   
    public Estudiante(String nombre, float codigo, String Programa, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.Programa = Programa;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCodigo() {
        return codigo;
    }

    public String getPrograma() {
        return Programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    
   
}
