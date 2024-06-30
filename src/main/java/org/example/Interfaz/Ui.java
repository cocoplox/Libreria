package org.example.Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui extends JFrame {
    //Botones y tal
    JButton addLibroButton = new JButton("Añadir Libro");
    public Ui(){
        setSize(720,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        addLibroButton.setSize(200,200);



        add(addLibroButton);

        addLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha presionado el boton");
            }
        });



        setVisible(true);
    }
}
