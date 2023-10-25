import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
//    public double input;
//    public double input2;
    public String input_Calc = "";
    public double holding_Calc = 0;
    public char operation = 'z';
    public JFrame f;
    public JTextField output;
    public JButton zero, one, two, three, four, five, six, seven, eight, nine;
    public JButton addition, subtraction, multiplication, division;
    public JButton clear, equals, flipped;
    public boolean isNegative;
    public JPanel centerPanel;
    public JPanel rightPanel;

    public static void main(String[] args) {
        Main myMain;
        myMain= new Main();

    }
    public Main(){
        setupGraphics();
    }
//    public String reverese(String in){
//
//        String backwords="";
//        char[] myChar = in.toCharArray();
//        for (int i = myChar.length - 1; i >= 0; i--) {
//            backwords= backwords+myChar[i];
//            //System.out.print(try1[i]);
//        }
//        return (backwords);
//    }
//    public double add(String in){
//        double sum = input + input2;
//        return sum;
//    }
//    public double subtract(String in){
//        double difference = input - input2;
//        return difference;
//    }
    public void setupGraphics(){
        f=new JFrame("Button Example");
        isNegative = false;
        f.setLayout(new BorderLayout());
        centerPanel = new JPanel();
        rightPanel = new JPanel();
        output= new JTextField();

//        JTextField input=new JTextField();
//        input.setBounds(50,50, 150,20);
//
//        JTextField input2 = new JTextField();
//        input2.setBounds(50,100,150,20);
//


//        JButton b=new JButton("Add");
//        b.setBounds(50,200,100,30);
//        b.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                String snum1 = input.getText();
//                String snum2 = input2.getText();
//                int answer = Integer.parseInt(snum1)+Integer.parseInt(snum2);
//                String answerText = answer + "";
//                output.setText(answerText);
//
//            }
//        });
//        JButton c=new JButton("Subtract");
//        c.setBounds(170,200,100,30);
//        c.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                String snum1 = input.getText();
//                String snum2 = input2.getText();
//                int answer = Integer.parseInt(snum1)-Integer.parseInt(snum2);
//                String answerText = answer + "";
//                output.setText(answerText);
//
//            }
//        });
        zero=new JButton("0");
        zero.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "0";
                output.setText(input_Calc);
            }
        });
        one=new JButton("1");
        one.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "1";
                output.setText(input_Calc);
            }
        });
        two=new JButton("2");
        two.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "2";
                output.setText(input_Calc);
            }
        });
        three=new JButton("3");
        three.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "3";
                output.setText(input_Calc);
            }
        });
        four=new JButton("4");
        four.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "4";
                output.setText(input_Calc);
            }
        });
        five=new JButton("5");
        five.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "5";
                output.setText(input_Calc);
            }
        });
        six=new JButton("6");
        six.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "6";
                output.setText(input_Calc);
            }
        });
        seven=new JButton("7");
        seven.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "7";
                output.setText(input_Calc);
            }
        });
        eight=new JButton("8");
        eight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "8";
                output.setText(input_Calc);
            }
        });
        nine=new JButton("9");
        nine.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "9";
                output.setText(input_Calc);
            }
        });
        addition=new JButton("+");
        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 'a';
            }
        });
        subtraction=new JButton("-");
        subtraction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 's';
            }
        });
        multiplication=new JButton("*");
        multiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 'm';
            }
        });
        division=new JButton("/");
        division.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 'd';
            }
        });
        equals=new JButton("=");
        equals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(operation=='a'){
                    holding_Calc += Double.parseDouble(input_Calc);
                    output.setText(holding_Calc + "");
                    input_Calc = holding_Calc + "";
                }if(operation=='s'){
                    holding_Calc -= Double.parseDouble(input_Calc);
                    output.setText(holding_Calc + "");
                    input_Calc = holding_Calc + "";
                }if(operation=='m'){
                    holding_Calc *= Double.parseDouble(input_Calc);
                    output.setText(holding_Calc + "");
                    input_Calc = holding_Calc + "";
                }if(operation=='d'){
                    holding_Calc /= Double.parseDouble(input_Calc);
                    output.setText(holding_Calc + "");
                    input_Calc = holding_Calc + "";
                }
            }
        });
        clear=new JButton("C");
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = 0;
                input_Calc = "";
                output.setText("");
            }
        });
        flipped=new JButton("(-)");
        flipped.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(isNegative == false){
                    //makes positive number negative
                    input_Calc = "-" + input_Calc;
                    output.setText(input_Calc);
                    isNegative = true;
                }if(isNegative == true){
                    //makes negative number positive
                    input_Calc = input_Calc.substring(2);
                    output.setText(input_Calc);
                    isNegative = false;
                }
            }
        });

        f.add(output,BorderLayout.NORTH);
        centerPanel.setSize(400,400);
        centerPanel.setLayout(new GridLayout(4,3));
        centerPanel.add(one);
        centerPanel.add(two);
        centerPanel.add(three);
        centerPanel.add(four);
        centerPanel.add(five);
        centerPanel.add(six);
        centerPanel.add(seven);
        centerPanel.add(eight);
        centerPanel.add(nine);
        centerPanel.add(zero);
        centerPanel.add(clear);
        centerPanel.add(flipped);
        f.add(centerPanel,BorderLayout.CENTER);
        rightPanel.setLayout(new GridLayout(5,1));
        rightPanel.add(equals);
        rightPanel.add(addition);
        rightPanel.add(subtraction);
        rightPanel.add(multiplication);
        rightPanel.add(division);
        f.add(rightPanel,BorderLayout.EAST);
//        f.add(addition);
//        f.add(subtraction);
//        f.add(multiplication);
//        f.add(division);
//        f.add(equals);
//        f.add(zero);
//        f.add(one);
//        f.add(two);
//        f.add(three);
//        f.add(four);
//        f.add(five);
//        f.add(six);
//        f.add(seven);
//        f.add(eight);
//        f.add(nine);
        //f.add(b);
        //f.add(c);
        //f.add(input);
        //f.add(input2);
        //f.add(output);
        f.setSize(400,400);
      //  f.setLayout(null);
        f.setVisible(true);
    }
}  