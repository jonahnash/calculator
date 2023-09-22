import java.awt.event.*;
import javax.swing.*;
public class Main {
    public double input;
    public double input2;
    public String input_Calc = "";
    public double holding_Calc = 0;
    public char operation = 'z';
    public JFrame f;
    public static void main(String[] args) {
        Main myMain;
        myMain= new Main();

    }
    public Main(){
        setupGraphics();
    }
    public String reverese(String in){

        String backwords="";
        char[] myChar = in.toCharArray();
        for (int i = myChar.length - 1; i >= 0; i--) {
            backwords= backwords+myChar[i];
            //System.out.print(try1[i]);
        }
        return (backwords);
    }
    public double add(String in){
        double sum = input + input2;
        return sum;
    }
    public double subtract(String in){
        double difference = input - input2;
        return difference;
    }
    public void setupGraphics(){
        f=new JFrame("Button Example");
//        JTextField input=new JTextField();
//        input.setBounds(50,50, 150,20);
//
//        JTextField input2 = new JTextField();
//        input2.setBounds(50,100,150,20);
//
        JTextField output=new JTextField();
        output.setBounds(90,20, 120,50);
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
        JButton zero=new JButton("0");
        zero.setBounds(20,20,50,50);
        zero.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "0";
                output.setText(input_Calc);
            }
        });
        JButton one=new JButton("1");
        one.setBounds(20,90,50,50);
        one.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "1";
                output.setText(input_Calc);
            }
        });
        JButton two=new JButton("2");
        two.setBounds(90,90,50,50);
        two.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "2";
                output.setText(input_Calc);
            }
        });
        JButton three=new JButton("3");
        three.setBounds(160,90,50,50);
        three.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "3";
                output.setText(input_Calc);
            }
        });
        JButton four=new JButton("4");
        four.setBounds(20,160,50,50);
        four.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "4";
                output.setText(input_Calc);
            }
        });
        JButton five=new JButton("5");
        five.setBounds(90,160,50,50);
        five.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "5";
                output.setText(input_Calc);
            }
        });
        JButton six=new JButton("6");
        six.setBounds(160,160,50,50);
        six.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "6";
                output.setText(input_Calc);
            }
        });
        JButton seven=new JButton("7");
        seven.setBounds(20,230,50,50);
        seven.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "7";
                output.setText(input_Calc);
            }
        });
        JButton eight=new JButton("8");
        eight.setBounds(90,230,50,50);
        eight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "8";
                output.setText(input_Calc);
            }
        });
        JButton nine=new JButton("9");
        nine.setBounds(160,230,50,50);
        nine.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input_Calc = input_Calc + "9";
                output.setText(input_Calc);
            }
        });
        JButton addition=new JButton("+");
        addition.setBounds(230,20,50,50);
        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 'a';
            }
        });
        JButton subtraction=new JButton("-");
        subtraction.setBounds(230,90,50,50);
        subtraction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 's';
            }
        });
        JButton multiplication=new JButton("*");
        multiplication.setBounds(230,160,50,50);
        multiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 'm';
            }
        });
        JButton division=new JButton("/");
        division.setBounds(230,230,50,50);
        division.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                holding_Calc = Double.parseDouble(input_Calc);
                input_Calc = "";
                operation = 'd';
            }
        });



        f.add(addition);
        f.add(subtraction);
        f.add(multiplication);
        f.add(division);
        f.add(zero);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        //f.add(b);
        //f.add(c);
        //f.add(input);
        //f.add(input2);
        f.add(output);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}  