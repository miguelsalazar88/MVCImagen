package vista;
import controlador.Controller;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Ventana extends JFrame {

    private Panel panel = new Panel();
    private Controller controller;
    private final JButton botonPintar = new JButton("Cargar Imagen");

    public Ventana(){
        this.setSize(1200,750);
        this.setTitle("MVC que carga una imagen.");
        this.initComponents();
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    // incializacion de componentes
    private void initComponents() {
        this.add(panel);
        this.add(botonPintar);
        this.botonPintar.setBounds(275,500,150,30);

    }

    public void setController(Controller controller){
        this.controller = controller;
        this.botonPintar.addActionListener(this.controller);
    }
}
