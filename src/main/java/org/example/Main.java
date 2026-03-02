package org.example;

import java.util.ArrayList;

public class main {

    private final ArrayList<Nota> listaNotas;

    public main() {
        listaNotas = new ArrayList<>();
    }

    // registrar
    public void registrarNota(Nota nota) {
        listaNotas.add(nota);
    }
     // consultar
    public Nota consultarNota(String codigoEstudiante, String codigoAsignatura, String periodo) {
        for (Nota n : listaNotas) {
            if (n.getPeriodo().equalsIgnoreCase(periodo) &&
                    n.getEstudiante().getCodigo().equals(codigoEstudiante) && n.getAsignatura().getCodigo().equals(codigoAsignatura)) {
                return n;
            } else {
            }
        }
        return null;
    }
    // modificar
    public boolean modificarNota(String codigoEstudiante, String codigoAsignatura, String periodo, double nuevoValor) {
        Nota nota = consultarNota(codigoEstudiante, codigoAsignatura, periodo);
        if (nota != null) {
            nota.setValor(nuevoValor);
            return true;
        }
        return false;
    }
    // eliminar
    public boolean eliminarNota(String codigoEstudiante, String codigoAsignatura, String periodo) {
        return listaNotas.removeIf(n ->
                {
            return n.getEstudiante().getCodigo().equals(codigoEstudiante) &&
                    n.getAsignatura().getCodigo().equals(codigoAsignatura) &&
                    n.getPeriodo().equalsIgnoreCase(periodo);
        }
        );
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }
}
