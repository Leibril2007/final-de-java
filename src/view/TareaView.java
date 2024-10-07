package src.view;

import src.controller.TareasController;
import src.model.Tarea;
import src.services.DataTareas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TareaView {

    public static JPanel disenioTarea(){

        ArrayList<Tarea> listaTarea = DataTareas.listaTarea();

        JPanel panelTareas = new JPanel();
        panelTareas.setPreferredSize(new Dimension(900, 1300));
        panelTareas.setBackground(Color.WHITE);
        return panelTareas;
    }

}
