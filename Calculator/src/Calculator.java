import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    private static final int POWER_X = 5;
    private static final int POWER_Y = 7;
    public double raiseNumberToPower(double number,int power){
        double result=1.0;
        for (int i = 0; i < power; i++) {
            result*=number;
        }
        return result;
    }
    public double sumTwoNumbers(double x,double y){
        return x + y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter value for X: ");
        double x = Double.parseDouble(reader.readLine());

        System.out.print("Enter value for X: ");
        double y = Double.parseDouble(reader.readLine());

        Calculator calculator = new Calculator();
        double XtoPower=calculator.raiseNumberToPower(x,POWER_X);
        double YtoPower=calculator.raiseNumberToPower(y,POWER_Y);
        double result=calculator.sumTwoNumbers(XtoPower,YtoPower);
        System.out.println("Result: " + result);
    }
}
