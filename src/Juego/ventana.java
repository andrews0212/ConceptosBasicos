package Juego;

import javax.swing.JFrame;

public class ventana {

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
        JFrame v1 = new JFrame();
        // definiremos el ta
        v1.setSize(horizontal, vertical); 
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setResizable(false);
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }

    public static void main(String[] args) {
        String titulo;
        int horizontal;
        int vertical;
        titulo = "Juego";
        horizontal = 800;
        vertical = 600;
        ventana v1 = new ventana();
        v1.getVentana(titulo, horizontal, vertical);
    }
}
