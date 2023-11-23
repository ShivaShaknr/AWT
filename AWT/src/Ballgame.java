import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ballgame extends Frame implements MouseMotionListener {
    int circlex=200;
    int circley=200;
    int radius=20;
    Ballgame(){
        addMouseMotionListener(this);

        setSize(400,400);
        setLayout(null);
        setTitle("Ball escape");
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circlex,circley,2*radius,2*radius);
    }
    public static void main(String[] args) {
        new Ballgame();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int X = e.getX();
        int Y = e.getY();
        if(X<circlex+radius){
            circlex++;
        }
        if(X>circlex+radius){
            circlex--;
        }
        if(Y<circley+radius){
            circley++;
        }
        if(Y>circley+radius){
            circley--;
        }
        repaint();


    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
