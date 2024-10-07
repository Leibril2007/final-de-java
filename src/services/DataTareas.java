package src.services;

import src.model.Tarea;

import java.util.ArrayList;

public class DataTareas {

    public static ArrayList listaTarea(){

        ArrayList<Tarea> tarea = new ArrayList<>();
        tarea.add(new Tarea("verbo to be", "oraciones con verbo to be", "16/9/2024", "pendiente"));
        tarea.add(new Tarea("simple present", "oraciones con presente simple", "15/9/2024", "en progreso"));
        tarea.add(new Tarea("ecuacion de vieta", "realizar los 15 ejercicios", "10/9/2024", "completado"));
        tarea.add(new Tarea("suma de fracciones", "realizar los 20 ejercicios", "20/9/2024", "pendiente"));
        tarea.add(new Tarea("object pronouns", "suba el sello de los ejercicios", "18/9/2024", "en progreso"));

        return tarea;

    }

}
