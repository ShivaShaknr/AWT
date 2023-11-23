import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Windowclose extends Frame implements WindowListener {
    Windowclose(){
        Button btn1 = new Button();
        add(btn1);

        addWindowListener(this);
        setLayout(null);
        setSize(500,500);
        setTitle("Windowclose");
        setVisible(true);
    }
    public static void main(String[] args) {
          new Windowclose();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


}
