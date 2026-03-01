package SistemaAcademico;

import java.util.ArrayList;

public class GestionNota {

    private ArrayList<Nota> listaNotas;

    public GestionNota() {
        listaNotas = new ArrayList<>();
    }

    // registrar
    public void registrarNota(Nota nota) {
        listaNotas.add(nota);
    }
     // consultar
    public Nota consultarNota(String codigoEstudiante, String codigoAsignatura, String periodo) {
        for (Nota n : listaNotas) {
            if (n.getEstudiante().getCodigo().equals(codigoEstudiante) &&
                n.getAsignatura().getCodigo().equals(codigoAsignatura) &&
                n.getPeriodo().equalsIgnoreCase(periodo)) {
                return n;
            }
        }
        return null;
    }