import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;


public class PanelDibujo extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();//Anchura total
        int altura = getHeight();//Altura total

        /*for (int i = 0; i <= altura; i+=10){
            g.drawLine(0,i+10,i,altura);
            g.drawLine(anchura,i,anchura-1,altura);
            g.drawLine(i,0,anchura,i+10);
            g.drawLine(anchura - i,0,0,i+10);
            g.setColor(new Color(51, 105, 141));
            g.setFont(new Font("Helvetica",Font.PLAIN,16));
        }*/

        /*g.draw3DRect(140,250,35,250,true);
        g.drawArc(-4,140,140,200,12,25);*/
        g.setColor(Color.BLUE);
        //La D por delante para formar el 3D
        g.drawLine(50, 90, 50, 200);//|Primera cara
        g.drawLine(50, 90, 90, 90);//Linea de arriba
        g.drawLine(50, 200, 90, 200);//Linea de abajo
        g.drawArc(65, 90, 50, 110, 90, -180);

        //La D por detras para formar el 3D
        g.drawLine(70, 70, 70, 180);// |Segunda cara
        g.drawLine(70, 70, 113, 70);//Linea de arriba
        g.drawLine(70, 180, 113, 180);//Linea de abajo
        g.drawArc(89, 70, 50, 110, 90, -180);

        //Dibujo para unir las dos caras
        g.drawLine(50,90,70,70);//Esquina superior de la parte de atras
        g.drawLine(50,200,70,180);//Esquina inferior de la parte de atras
        g.drawLine(90,90,113,70);//Esquina superior enfrente de la curva
        g.drawLine(93,200,113,180);
        g.drawArc(85, 70, 50, 110, 90, -180);
        g.drawArc(82, 73, 50, 110, 90, -180);
        g.drawArc(79, 76, 50, 110, 90, -180);
        g.drawArc(76, 79, 50, 110, 90, -180);
        g.drawArc(73, 82, 50, 110, 90, -180);
        g.drawArc(70, 85, 50, 110, 90, -180);
        g.drawArc(67, 88, 50, 110, 90, -180);

        //Dibujar la A
        g.drawLine(200,90,145,200);// / De la A
        g.drawLine(200,90,255,200);// \ De la A
    }
}
