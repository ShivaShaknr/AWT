import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class MouseEvent extends Frame implements MouseListener {
    Label text;
    MouseEvent(){
        text = new Label("I am mouse");

        add(text);
        addMouseListener(this);
        setLayout(new FlowLayout());
        setSize(1000,1000);
        setTitle("Mouse Listener");
        setVisible(true);
    }
    public static void main(String[] args) {
        new MouseEvent();
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        text.setText("I'm clicked now");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
         text.setText("I'm pressed now");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
          text.setText("I'm released now");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
         text.setText("I'm entered");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        text.setText("I'm exited Bye!!");
    }
}
