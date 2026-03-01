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