import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame {



    private JTextField num1 = new JTextField(3);
    private JLabel operation = new JLabel("?");
    private JTextField num2 = new JTextField(3);
    private JButton add = new JButton("Add");
    private JButton subtract = new JButton("Subtract");
    private JButton multiply = new JButton ("Multiply");
    private JButton divide = new JButton ("Divide");
    private JLabel equals = new JLabel("=");
    private JTextField result = new JTextField(3);

    public CalculatorView(){

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(210,200);

        calcPanel.add(num1);
        calcPanel.add(operation);
        calcPanel.add(num2);
        calcPanel.add(equals);
        calcPanel.add(result);

        calcPanel.add(add);
        calcPanel.add(subtract);
        calcPanel.add(multiply);
        calcPanel.add(divide);


        this.add(calcPanel);
    }

    public double getNum1(){
        return Double.parseDouble(num1.getText());
    }

    public double getNum2(){
        return Double.parseDouble(num2.getText());
    }

    public void setResult(double res){
        result.setText(Double.toString(res));
    }

    public void setOperation(String op){
        operation.setText(op);
    }

    void addCalculationListener(ActionListener listenForCalc){
        add.addActionListener(listenForCalc);
    }

    void subtractCalculationListener(ActionListener listenForCalc){
        subtract.addActionListener(listenForCalc);
    }

    void multiplyCalculationListener(ActionListener listenForCalc){
        multiply.addActionListener(listenForCalc);
    }

    void divideCalculationListener(ActionListener listenForCalc){
        divide.addActionListener(listenForCalc);
    }

    void displayError(String error){
        JOptionPane.showMessageDialog(this,error);
    }

}
