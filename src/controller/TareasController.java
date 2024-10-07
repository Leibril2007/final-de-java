package src.controller;

import src.model.Tarea;
import src.services.DataTareas;
import src.view.TareaView;
import src.view.TareasView;

import javax.swing.*;
import java.util.ArrayList;

public class TareasController {

    public ArrayList<Tarea> tareas;

    public static void imprimirLista(){

        ArrayList<Tarea> listaMedicamento = DataTareas.listaTarea();
        JPanel disenioT =  TareaView.disenioTarea();

        for (Tarea infoTarea : listaMedicamento){
            disenioT.add(new JLabel(infoTarea.getTitulo()));
            disenioT.add(new JLabel(infoTarea.getDescripcion()));
            disenioT.add(new JLabel(infoTarea.getFechaLimite()));
            disenioT.add(new JLabel(infoTarea.getUnEstado()));
        }

    }

}
