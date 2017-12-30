import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model){

        this.view=view;
        this.model=model;

        this.view.addCalculationListener(new AdditionListener());
        this.view.subtractCalculationListener(new SubtractionListener());
        this.view.multiplyCalculationListener(new MultiplicationListener());
        this.view.divideCalculationListener(new DivisionListener());
    }

    class AdditionListener implements ActionListener{
        public void actionPerformed (ActionEvent event){
            double num1, num2;

            try{
                num1=view.getNum1();
                num2=view.getNum2();

                model.add(num1,num2);

                view.setOperation("+");
                view.setResult(model.getResult());

            }catch(NumberFormatException ex){
                view.displayError("you must enter 2 double-type numbers");
            }
        }
    }

    class SubtractionListener implements ActionListener{
        public void actionPerformed (ActionEvent event){
            double num1, num2;

            try{
                num1=view.getNum1();
                num2=view.getNum2();

                model.subtract(num1,num2);

                view.setOperation("-");
                view.setResult(model.getResult());

            }catch(NumberFormatException ex){
                view.displayError("you must enter 2 double-type numbers");
            }
        }
    }

    class MultiplicationListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double num1, num2;

            try{
                num1=view.getNum1();
                num2=view.getNum2();

                model.multiply(num1,num2);

                view.setOperation("*");
                view.setResult(model.getResult());

            }catch(NumberFormatException ex){
                view.displayError("you must enter 2 double-type numbers");
            }
        }
    }

    class DivisionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double num1, num2;

            try{
                num1=view.getNum1();
                num2=view.getNum2();

                model.divide(num1,num2);

                view.setOperation("/");
                view.setResult(model.getResult());

            }catch(NumberFormatException ex){
                view.displayError("you must enter 2 double-type numbers");
            }
        }
    }
}
