package src.view;

import javax.swing.*;
import java.awt.*;

public class TareasView extends JFrame {



    public TareasView(){
        this.setSize(1800, 1300);
        this.setLayout(new GridLayout(1,2));
        this.setLocationRelativeTo(null);
        this.setTitle("TAREAS");
        this.setBackground(Color.WHITE);

        //PANEL PRINCIPAL
        JPanel panelControles = new JPanel(new GridLayout(2,1));
        panelControles.setSize(1800, 1300);
        panelControles.setBackground(Color.ORANGE);



        //PANEL TAREAS
        JPanel panelTareas = new JPanel();
        panelTareas.setBackground(Color.white);
        panelTareas.add(TareaView.disenioTarea());

        // PANEL FORMULARIO
        JPanel panelFormulario = new JPanel(new GridBagLayout());
        panelFormulario.setBackground(Color.WHITE);
        panelFormulario.add(NuevaTareaView.inputTarea());

        panelControles.add(panelFormulario);

        // PANEL ELIMINAR TAREA
        JPanel panelFormEliminarTarea = new JPanel(new GridBagLayout());
        panelFormEliminarTarea.setBackground(Color.white);
        panelFormEliminarTarea.add(EliminarTareaView.eliminarTarea());

        panelControles.add(panelFormEliminarTarea);

        this.add(panelControles);
        this.add(panelTareas);
        this.setVisible(true);
    }




}
