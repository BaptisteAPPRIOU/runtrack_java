package com.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ma fenêtre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du bouton "Quitter"
        JButton quitButton = new JButton("Quitter");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Ajout du bouton "Quitter" en bas de la fenêtre
        frame.add(quitButton, BorderLayout.SOUTH);

        // Affichage de la fenêtre
        frame.pack();
        frame.setVisible(true);
    }
}