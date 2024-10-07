package src.view;

import javax.swing.*;
import java.awt.*;

public class NuevaTareaView {


    public static JPanel inputTarea(){

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.setPreferredSize(new Dimension(700, 330));
        panel.setBackground(Color.white);

        JPanel panel2 = new JPanel(new GridLayout(5,1, 30,20));
        panel2.setBackground(Color.white);

        JTextField input1 = new JTextField();
        input1.setPreferredSize(new Dimension(350, 20));
        panel2.add(input1);

        JTextField input2 = new JTextField();
        input2.setPreferredSize(new Dimension(350, 50));
        panel2.add(input2);

        JTextField input3 = new JTextField();
        input3.setPreferredSize(new Dimension(350, 50));
        panel2.add(input3);

        JTextField input4 = new JTextField();
        input4.setPreferredSize(new Dimension(350, 50));
        panel2.add(input4);

        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.setBackground(Color.white);

        JButton btn1 = new JButton("Agregar tarea");
        btn1.setPreferredSize(new Dimension(130, 45));
        panel3.add(btn1, BorderLayout.SOUTH);


        panel.add(panel2);
        panel.add(panel3);

        return panel;
    }

}
