import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends Frame {
    TextField display;
    Button inc,reset,dec;
    Counter(){
        display=new TextField("0");
        display.setBounds(50,50,100,30);

        inc = new Button("Inc++");
        inc.setBounds(75,100,50,20);
        inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n= Integer.parseInt(display.getText());
                display.setText(String.valueOf(++n));
            }
        });

        dec = new Button("Dec--");
        dec.setBounds(75,120,50,20);
        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(display.getText());
                if(n>0) {
                    display.setText(String.valueOf(--n));
                }
            }
        });

        reset = new Button("Reset");
        reset.setBounds(75,80,50,20);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });

        add(display);
        add(inc);
        add(dec);
        add(reset);


        setLayout(null);
        setSize(500,500);
        setTitle("Counter");
        setVisible(true);

    }
    public static void main(String[] args) {
        new Counter();

    }
}
