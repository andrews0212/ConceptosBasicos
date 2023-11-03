package lol;

import java.util.Arrays;

public class Campeones {
    static String[] miticos = {"Escudo Ancestral", "Anima de los Reinos", "Eco de Luden", "Devorador de Maná", "Hidra Voraz", "Guillotina de Kraken", "Escudo Solar", "Mandato Imperial", "Imperio Divino", "Cuchilla Nocturna", "Báculo Anulador", "Divinidad", "Pistola Llamante", "Cinturon de Hextech"};
    static String[] legendarios = {"Filo Infinito", "Guantelete de Hielo", "Fuerza de la Trinidad", "El Filo del Rey Arruinado", "Bastón del Vacío", "Cetro de Cristal de Rylai", "Zhonya's Aro", "Susurro de la Serpiente", "Trinidad Forjada", "Esencia Reaver", "Manamune"};
    static String[] botas = {"Botas", "Botas Del Hechicero", "Grebas del Berserker", "Botas de Rapidez", "Botas blidadas", "Botas de Movilidad", "Botas Jonias"};

    static void getBuild(int numeroItems) {

    }

    static void listarItems() {

        System.out.println("ITEMS");
        System.out.println("------MITICOS------");
        for (int i = 0; i < miticos.length; i++) {
            System.out.println(i + " " + miticos[i]);
        }
        System.out.println("------LEGENDARIOS------");
        for (int i = 0; i < legendarios.length; i++) {
            System.out.println(i + " " + legendarios[i]);
        }
        System.out.println("-----BOTAS-----");
        for (int i = 0; i < botas.length; i++) {
            System.out.println(i + " " + botas[i]);
        }
    }
    public static void main(String[] args) {
    listarItems();
    }
}
