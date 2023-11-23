import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    Main(){
        Frame frame = new Frame("My project");

        Label email = new Label("Email:");
        email.setBounds(50,130,100,30);
        TextField emailip = new TextField("Enter email");
        emailip.setBounds(170,130,150,30);

        Label password = new Label("Password:");
        password.setBounds(50,170,100,30);
        TextField passip = new TextField("Enter password");
        passip.setBounds(170,170,150,30);

        Label age = new Label("Age:");
        age.setBounds(50,210,100,30);
        TextField ageip = new TextField("Enter Age");
        ageip.setBounds(170,210,150,30);

        Button btn = new Button("Submit");
        btn.setBounds(200,250,100,30);

        ActionListener submit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(emailip.getText());
                System.out.println(passip.getText());
                System.out.println(ageip.getText());

            }
        };
        btn.addActionListener(submit);






        frame.add(email);
        frame.add(password);
        frame.add(age);
        frame.add(emailip);
        frame.add(passip);
        frame.add(ageip);
        frame.add(btn);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(100,100);
    }

    public static void main(String[] args) {
        new Main();

    }
}