import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        try{
            //Crear un panel que contiene nuestro dibujo
            PanelDibujo panel = new PanelDibujo();
            JFrame applicacion = new JFrame();

            //Establece el marco para cerra cuando se cierre la aplicacion
            applicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            applicacion.add(panel);//Agrega el panel al marco
            applicacion.setSize(500,500);//Establece el tamaño del marco
            applicacion.setVisible(true);//Hace que el marco sea visible
        }catch(Exception ex){
            System.out.println("Algun dato ingresado incorrectamente!!! " + ex.getMessage());
        }
    }
}
