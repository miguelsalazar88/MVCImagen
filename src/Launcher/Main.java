package Launcher;

import controlador.Controller;
import modelo.Modelo;
import vista.Ventana;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Modelo modelo = new Modelo(ventana);
        Controller controller = new Controller(ventana, modelo);

    }
}
