import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button one,two,three,four,five,six,seven,eight,nine,zero,reset,plus,minus,divison,multiple,eq;
    Calculator(){
        display = new TextField("0");

        one  = new Button("1");
        one.addActionListener(this);

        two = new Button("2");
        two.addActionListener(this);

        three = new Button("3");
        three.addActionListener(this);

        four = new Button("4");
        four.addActionListener(this);

        five = new Button("5");
        five.addActionListener(this);

        six = new Button("6");
        six.addActionListener(this);

        seven = new Button("7");
        seven.addActionListener(this);

        eight = new Button("8");
        eight.addActionListener(this);

        nine = new Button("9");
        nine.addActionListener(this);

        zero = new Button("0");
        zero.addActionListener(this);

        plus = new Button("+");
        plus.addActionListener(this);

        minus = new Button("-");
        minus.addActionListener(this);

        multiple = new Button("x");
        multiple.addActionListener(this);

        divison = new Button("/");
        divison.addActionListener(this);

        eq = new Button("=");
        eq.addActionListener(this);

        reset = new Button("reset");
        reset.addActionListener(this);


        add(display);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        add(plus);
        add(minus);
        add(multiple);
        add(divison);
        add(reset);
        add(eq);

        setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Calci");
        setVisible(true);


    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==reset){
            display.setText("0");
        }
        if(e.getSource()==plus){
            String s = display.getText();
            s+="+";
            display.setText(s);
        }
        if(e.getSource()==minus){
            String s = display.getText();
            s+="-";
            display.setText(s);
        }
        if(e.getSource()==multiple){
            String s = display.getText();
            s+="*";
            display.setText(s);
        }
        if(e.getSource()==divison){
            String s = display.getText();
            s+="/";
            display.setText(s);
        }
        if(e.getSource()==one){
            String s = display.getText();
            s+=1;
            display.setText(s);
        }

        if(e.getSource()==two){
            String s = display.getText();
            s+=2;
            display.setText(s);
        }

        if(e.getSource()==three){
            String s = display.getText();
            s+=3;
            display.setText(s);
        }

        if(e.getSource()==four){
            String s = display.getText();
            s+=4;
            display.setText(s);
        }

        if(e.getSource()==five){
            String s = display.getText();
            s+=5;
            display.setText(s);
        }

        if(e.getSource()==six){
            String s = display.getText();
            s+=6;
            display.setText(s);
        }

        if(e.getSource()==seven){
            String s = display.getText();
            s+=7;
            display.setText(s);
        }

        if(e.getSource()==eight){
            String s = display.getText();
            s+=8;
            display.setText(s);
        }

        if(e.getSource()==nine){
            String s = display.getText();
            s+=9;
            display.setText(s);
        }

        if(e.getSource()==zero){
            String s = display.getText();
            s+=0;
            display.setText(s);
        }
        if(e.getSource()==eq){
            int i;
            char operator='+';

            String s = display.getText();
            String tempA = "";
            String tempB = "";

            for(i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    tempA+=s.charAt(i);
                }
                else{
                    operator = s.charAt(i);
                    break;
                }
            }
            tempB = s.substring(i+1);
            int a = Integer.parseInt(tempA);
            int b = Integer.parseInt(tempB);
            int ans = 0;

            switch(operator){
                case '+':
                    ans  = a+b;
                    break;
                case '-':
                    ans = a-b;
                    break;
                case 'x':
                    ans = a*b;
                    break;
                case '/':
                    ans = a/b;
                    break;
            }
            display.setText(String.valueOf(ans));

        }



    }
    public static void main(String[] args) {
        new Calculator();

    }
}
