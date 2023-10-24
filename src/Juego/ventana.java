package Juego;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Canvas;
public class ventana extends Canvas{

    static JFrame v1;
    static final String titulo = "Juego";
    static final int horizontal = 800;
    static final int vertical = 600;
    
    /*
     * Crear ventana recibiendo por parametros
     * 
     * @param Nombre titulo que va a tener la ventana.
     * 
     * @param horizontal tamaño horizontal de la ventana.
     * 
     * @param vertical tamaño vertical de la ventana.
     * 
     */
    public static void getVentana(String Nombre, int horizontal, int vertical) {
        
        v1 = new JFrame(Nombre);
        v1.setSize(horizontal, vertical); 
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }

    public static void main(String[] args) {
        getVentana(titulo, horizontal, vertical);
    }
}
