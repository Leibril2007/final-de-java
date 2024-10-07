package src.view;

import javax.swing.*;
import java.awt.*;

public class EliminarTareaView {

    public static JPanel eliminarTarea(){

        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setPreferredSize(new Dimension(700, 330));
        panel1.setBackground(Color.white);

        GridBagConstraints restriccion = new GridBagConstraints();

        JTextField input1 = new JTextField();
        input1.setPreferredSize(new Dimension(350, 50));

        restriccion.gridx = 0;
        restriccion.gridy = 0;

        panel1.add(input1, restriccion);

        JButton btn = new JButton("Eliminar Tarea");
        btn.setPreferredSize(new Dimension(200,40));

        restriccion.gridx = 1;
        restriccion.gridy = 1;

        panel1.add(btn, restriccion);

        return panel1;
    }

}
